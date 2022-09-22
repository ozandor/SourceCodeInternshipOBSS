package tr.com.obss.jip.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    private String surname;

    @NotNull
    @Column(nullable = false, unique = true)
    private String username;

    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    private Integer age;

    private String city;

    @Column(length = 500, nullable = true)
    private String address;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Image profileImage;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Book> books;


}
