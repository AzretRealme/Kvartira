package House.models.outputs;

import House.enums.ReserveStatus;
import lombok.Data;

@Data
public class OutputPayData {
    private double paidCash;
    private ReserveStatus reserveStatus;
}
