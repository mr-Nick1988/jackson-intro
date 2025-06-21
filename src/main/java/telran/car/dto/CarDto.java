package telran.car.dto;

import lombok.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
@Builder
public class CarDto {
    private String manufacturer;
    private int year;
    @Singular
    private List<String> models;


}
