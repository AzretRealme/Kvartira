package House.mappers;


import House.models.dto.PayHistoryDto;
import House.models.entities.PayHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface PayHistoryMapper {
    PayHistoryMapper INSTANCE = Mappers.getMapper(PayHistoryMapper.class);

    PayHistory toPayHistory(PayHistoryDto payHistoryDto);
    PayHistoryDto toPayHistoryDto(PayHistory payHistory);

    List<PayHistory> toPayHistoryList(List<PayHistoryDto> payHistoryDtoList);
    List<PayHistoryDto> toPayHistoryDtoList(List<PayHistory> payHistories);
}
