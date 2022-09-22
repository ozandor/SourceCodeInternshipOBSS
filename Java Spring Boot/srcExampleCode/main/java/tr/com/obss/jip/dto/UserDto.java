package tr.com.obss.jip.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Builder
public class UserDto {

    private String name;

    private String Surname;

    private Integer age;

    private String city;

    private String address;

    private ImageDto pImage;

    private List<BookDto> books;

}
