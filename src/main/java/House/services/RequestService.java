package House.services;


import House.models.dto.RequestDto;
import House.models.inputs.InputRequestData;

public interface RequestService extends BaseCrudService<RequestDto, Long>{
    RequestDto saveWithInput(InputRequestData inputRequestData);

    long countAllByCodeIdAndSuccess(Long code_id, boolean success);

}
