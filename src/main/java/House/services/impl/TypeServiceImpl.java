package House.services.impl;


import House.dao.TypeRepo;
import House.mappers.TypeMapper;
import House.models.dto.TypeDto;
import House.models.entities.Type;
import House.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepo typeRepo;

    @Override
    public TypeDto save(TypeDto typeDto) {
        Type type = TypeMapper.INSTANCE.toType(typeDto);
        typeDto.setActive(true);
        type = typeRepo.save(type);
        return TypeMapper.INSTANCE.toTypeDto(type);
    }

    @Override
    public TypeDto update(TypeDto typeDto) {
        return null;
    }

    @Override
    public TypeDto findById(Long id) {
        Type type = typeRepo.findById(id).orElseThrow(()->new RuntimeException("Тип по айди не найден!"));
        return TypeMapper.INSTANCE.toTypeDto(type);
    }

    @Override
    public List<TypeDto> findAll() {
        return null;
    }
}
