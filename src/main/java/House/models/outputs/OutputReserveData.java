package House.models.outputs;


import House.enums.ReserveStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OutputReserveData {
    private Long houseId;
    private Long customerId;
    private ReserveStatus reserveStatus;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
    private double cash;
}
