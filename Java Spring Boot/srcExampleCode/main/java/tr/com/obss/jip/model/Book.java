package tr.com.obss.jip.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
