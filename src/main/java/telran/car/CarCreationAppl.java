package telran.car;
import com.fasterxml.jackson.databind.ObjectMapper;
import telran.car.dto.CarDto;
import java.io.File;
import java.io.IOException;
import java.util.Set;


public class CarCreationAppl {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
//        Set<String> models = Set.of("Laguna", "Megane", "Clio");
//        CarDto carDto = new CarDto("Renault", 2020, models);
        CarDto carDto = CarDto.builder()
                .manufacturer("Renault")
                .year(2022)
                .model("Laguna")
                .model("Megane")
                .model("Clio")
                .build();
        mapper.writeValue(new File("renault.json"), carDto);
    }
}
