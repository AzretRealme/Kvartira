package House.mappers;


import House.models.dto.RequestDto;
import House.models.entities.Request;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface RequestMapper {
    RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    Request toRequest(RequestDto requestDto);
    RequestDto toRequestDto(Request request);

    List<Request> toRequestList(List<RequestDto> requestDtoList);
    List<RequestDto> toRequestDtoList(List<Request> requestList);

}
