package House.models.dto;

import lombok.Data;

@Data
public class DistrictDto {
    private Long id;
    private CityVillageDto cityVillage;
    private String name;
}
