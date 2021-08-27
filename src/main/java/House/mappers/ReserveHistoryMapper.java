package House.mappers;


import House.models.dto.ReserveHistoryDto;
import House.models.entities.ReserveHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReserveHistoryMapper {
    ReserveHistoryMapper INSTANCE = Mappers.getMapper(ReserveHistoryMapper.class);

    ReserveHistory toReserveHistory(ReserveHistoryDto reserveHistoryDto);
    ReserveHistoryDto toReserveHistoryDto(ReserveHistory reserveHistory);

    List<ReserveHistory> toReserveHistoryList(List<ReserveHistoryDto> reserveHistoryDtoList);
    List<ReserveHistoryDto> toReserveHistoryDtoList(List<ReserveHistory> reserveHistoryList);
}
