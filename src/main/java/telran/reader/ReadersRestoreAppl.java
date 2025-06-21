package telran.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import telran.reader.dto.ReaderDto;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadersRestoreAppl {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static void main(String[] args) throws IOException {
//       ReaderDto[] readers = mapper.readValue(new File("readers.json"), ReaderDto[].class);

//        TypeFactory typeFactory = mapper.getTypeFactory();
//        JavaType readerDtoType = typeFactory.constructType(ReaderDto.class);
//        JavaType listOfReaderDtoType = typeFactory.constructCollectionType(List.class, readerDtoType);
//        List<ReaderDto> readers = mapper.readValue(new File("readers.json"), listOfReaderDtoType);

        List<ReaderDto> readers = mapper.readValue(new File("readers.json"),new TypeReference<List<ReaderDto>>(){});
        for (ReaderDto reader : readers) {
            System.out.println(reader);
        }
    }
}

