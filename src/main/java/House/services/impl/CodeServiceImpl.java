package House.services.impl;


import House.dao.CodeRepo;
import House.enums.CodeStatus;
import House.mappers.CodeMapper;
import House.models.dto.CodeDto;
import House.models.dto.RequestDto;
import House.models.dto.UserDto;
import House.models.entities.Code;
import House.models.inputs.InputUserData;
import House.services.CodeService;
import House.services.RequestService;
import House.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    private CodeRepo codeRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private RequestService requestService;


    @Override
    public CodeDto findCodeById(Long id) {
        Code code = codeRepo.findById(id).orElseThrow(()-> new RuntimeException("Код по айди не найден!"));
        return CodeMapper.INSTANCE.toCodeDto(code);
    }

    @Override
    public InputUserData chekCode(long code_id, long user_code) {
    if (user_code <=0){
        throw new RuntimeException("Введи нормально!");
    }
        CodeDto codeDto = findCodeById(code_id);
    if (codeDto.getCode().equals(user_code)){
        codeDto.setCodeStatus(CodeStatus.APPROVED);
    }
    if (!codeDto.getCode().equals(user_code)){
        codeDto.setCodeStatus(CodeStatus.FAILED);
    }else codeDto.setCodeStatus(CodeStatus.CANCELED);

    codeDto = saveForCode(codeDto);
    InputUserData inputUserData = new InputUserData();
    inputUserData.setCode_id(code_id);
    inputUserData.setUserCode(user_code);

        return inputUserData;
    }

    @Override
    public CodeDto saveForCode(CodeDto codeDto) {
        return null;
    }

    @Override
    public void sendCode(UserDto userDtoSaved) {
        CodeDto codeDto = new CodeDto();
        codeDto.setCodeStatus(CodeStatus.NEW);
        Date todayDateToConvert = new Date();
        LocalDateTime todaysDate = todayDateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        codeDto.setStartDate(todaysDate);
        codeDto.setEndDate(codeDto.getStartDate().plusMinutes(3));
        codeDto.setCode(generateCode());
        codeDto.setUser(userDtoSaved);
        save(codeDto);
    }

    @Override
    public boolean putCode(long code, Long userId) {
        CodeDto codeDto = findByUserId(userId);
        if(codeDto.getCodeStatus().equals(CodeStatus.CANCELED)){
            throw new RuntimeException("Your code is cancelled!!!");
        }
        long trueCode = codeDto.getCode();
        RequestDto requestDto = new RequestDto();
        Date todayDateToConvert = new Date();
        LocalDateTime todaysDate = todayDateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        long possibleSeconds = codeDto.getEndDate().until(todaysDate, ChronoUnit.SECONDS);
        if(possibleSeconds > 1) {
            if (code == trueCode) {
                codeDto.setCodeStatus(CodeStatus.APPROVED);
                requestDto.setSuccess(true);
            } else {
                codeDto.setCodeStatus(CodeStatus.FAILED);
                requestDto.setSuccess(false);
            }
            codeDto = save(codeDto);
            requestDto.setCode(codeDto);
            requestDto = requestService.save(requestDto);
            if(requestDto.isSuccess()){
                return true;
            }
            long countOfNotSuccessfulRequests = requestService.countAllByCodeIdAndSuccess(codeDto.getId(), false);
            if(countOfNotSuccessfulRequests > 2){
                codeDto.setCodeStatus(CodeStatus.CANCELED);
                codeDto = save(codeDto);
                return false;
            }
        }else {
            codeDto.setCodeStatus(CodeStatus.CANCELED);
            UserDto userDto = userService.findById(userId);
            userDto.setBlockDate(todaysDate.plusHours(1));
            UserDto savedUser = userService.update(userDto);
            save(codeDto);
        }
        return false;
    }

    @Override
    public CodeDto findByUserId(Long id) {
        Code code = codeRepo.findByUserId(id);
        return CodeMapper.INSTANCE.toCodeDto(code);
    }

    private long generateCode(){
        return (long) ((Math.random() * (9999 - 1000)) + 1000);
    }


    @Override
    public CodeDto save(CodeDto codeDto) {
        Code code = CodeMapper.INSTANCE.toCode(codeDto);
        code = codeRepo.save(code);
        return CodeMapper.INSTANCE.toCodeDto(code);
    }

    @Override
    public CodeDto update(CodeDto codeDto) {
        return null;
    }

    @Override
    public CodeDto findById(Long id) {
        return null;
    }

    @Override
    public List<CodeDto> findAll() {
        return null;
    }
}
