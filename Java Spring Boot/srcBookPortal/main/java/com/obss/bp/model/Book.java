package com.obss.bp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "book_seq", allocationSize = 50)
@Entity
public class Book extends BaseEntity {

    private String name;

    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    // Book can only have one user at a time.
    private User user;

}
