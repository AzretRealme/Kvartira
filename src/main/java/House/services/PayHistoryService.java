package House.services;




import House.models.dto.PayHistoryDto;

import java.util.List;

public interface PayHistoryService extends BaseCrudService<PayHistoryDto, Long>{
    List<PayHistoryDto> findByReserveHistoryId(Long reserve_id);
}
