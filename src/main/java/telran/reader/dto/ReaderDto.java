package telran.reader.dto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReaderDto {
    private int id;
    public String name;
    private int birthYear;
    @Singular
    private List<String> lovedBooks;

    //@JsonIgnore
    public String getMostLovedBook() {
        return lovedBooks.isEmpty() ? "" : lovedBooks.get(0);
    }
}

