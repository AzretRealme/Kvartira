package House.models.dto;

import House.enums.CodeStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CodeDto {
    private Long id;
    private Long code;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private CodeStatus codeStatus;
    private UserDto user;
}
