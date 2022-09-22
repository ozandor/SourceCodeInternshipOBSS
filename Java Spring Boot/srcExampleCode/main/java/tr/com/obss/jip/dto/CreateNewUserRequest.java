package tr.com.obss.jip.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
public class CreateNewUserRequest {

    @NotNull
    @Size(min = 3, max = 20)
    private String name;

    @NotNull
    private String surname;

    private Integer age;

    private String city;

    private String address;

    @NotNull
    private String username;

    @NotNull
    private String password;

}
