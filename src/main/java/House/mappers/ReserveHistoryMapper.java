package House.mappers;


import House.models.dto.ReserveHistoryDto;
import House.models.entities.ReserveHistory;
import House.models.outputs.OutputReserveData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReserveHistoryMapper {
    ReserveHistoryMapper INSTANCE = Mappers.getMapper(ReserveHistoryMapper.class);

    ReserveHistory toReserveHistory(ReserveHistoryDto reserveHistoryDto);

    ReserveHistoryDto toReserveHistoryDto(ReserveHistory reserveHistory);

     default OutputReserveData toOutputReserveHistory(ReserveHistoryDto reserveHistoryDto, double cash){
        OutputReserveData outputReserveData = new OutputReserveData();
        outputReserveData.setReserveStatus(reserveHistoryDto.getReserveStatus());
        outputReserveData.setCustomerId(reserveHistoryDto.getUser().getId());
        outputReserveData.setStartDate(reserveHistoryDto.getStartDate());
        outputReserveData.setEndDate(reserveHistoryDto.getEndDate());
        outputReserveData.setTotalPrice(reserveHistoryDto.getTotalPrice());
        outputReserveData.setCash(cash); outputReserveData.setHouseId(reserveHistoryDto.getHouse().getId());
        return outputReserveData;
     }

    List<ReserveHistory> toReserveHistoryList(List<ReserveHistoryDto> reserveHistoryDtoList);
    List<ReserveHistoryDto> toReserveHistoryDtoList(List<ReserveHistory> reserveHistoryList);
}
