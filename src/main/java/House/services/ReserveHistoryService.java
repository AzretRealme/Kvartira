package House.services;


import House.models.dto.ReserveHistoryDto;
import House.models.inputs.InputReserveHistoryData;
import House.models.outputs.OutputReserveData;

public interface ReserveHistoryService extends BaseCrudService<ReserveHistoryDto, Long>{
    ReserveHistoryDto saveWithInput(InputReserveHistoryData inputReserveHistoryData);
    OutputReserveData pay(Long user_id, double cash);

}
