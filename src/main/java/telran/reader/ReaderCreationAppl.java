package telran.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import telran.reader.dto.ReaderDto;

import java.io.File;
import java.io.IOException;

public class ReaderCreationAppl {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        ReaderDto[]readers = {
                ReaderDto.builder()
                .id(1000)
                .name("Peter")
                .birthYear(1988)
                .lovedBook("Book1")
                .lovedBook("Book2")
                .build(),
                ReaderDto.builder()
                        .id(2000)
                        .name("Mary")
                        .birthYear(1995)
                        .lovedBook("Book3")
                        .lovedBook("Book4")
                        .build()

        };
        mapper.writeValue(new File("readers.json"),readers);
    }
}
