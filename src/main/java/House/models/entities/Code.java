package House.models.entities;

import House.enums.CodeStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "codes")
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Enumerated(EnumType.STRING)
    private CodeStatus codeStatus;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
