package telran.car;

import com.fasterxml.jackson.databind.ObjectMapper;
import telran.car.dto.CarDto;

import java.io.File;
import java.io.IOException;

public class CarRestoreAppl {
    private static ObjectMapper mapper =  new ObjectMapper();

    public static void main(String[] args) throws IOException {
        CarDto carDto = mapper.readValue(new File("renault.json"),CarDto.class);
        System.out.println(carDto);
    }
}
