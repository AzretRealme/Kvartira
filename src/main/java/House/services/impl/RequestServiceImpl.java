package House.services.impl;

import House.dao.RequestRepo;
import House.mappers.RequestMapper;
import House.models.dto.RequestDto;
import House.models.dto.ReserveHistoryDto;
import House.models.entities.Request;
import House.models.inputs.InputRequestData;
import House.services.CodeService;
import House.services.RequestService;
import House.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestRepo requestRepo;
    @Autowired
    private CodeService codeService;
    @Autowired
    private UserService userService;
    @Override
    public RequestDto saveWithInput(InputRequestData inputRequestData) {
        Request request = new Request();
        request.setSuccess(true);
//        request.setCode(codeService.findById(inputRequestData.getCodeId()));
        return RequestMapper.INSTANCE.toRequestDto(request);
    }

    @Override
    public long countAllByCodeIdAndSuccess(Long code_id, boolean success) {
        return requestRepo.countAllByCodeIdAndSuccess(code_id, success);
    }


    @Override
    public RequestDto save(RequestDto requestDto) {
        Request request = RequestMapper.INSTANCE.toRequest(requestDto);
        request = requestRepo.save(request);
        return  RequestMapper.INSTANCE.toRequestDto(request);
    }

    @Override
    public RequestDto update(RequestDto requestDto) {
        return null;
    }

    @Override
    public RequestDto findById(Long id) {
        return null;
    }

    @Override
    public List<RequestDto> findAll() {
        return null;
    }

}
