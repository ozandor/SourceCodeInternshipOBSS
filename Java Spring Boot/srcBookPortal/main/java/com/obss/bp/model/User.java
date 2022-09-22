package com.obss.bp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@SequenceGenerator(name="SEQ_GENERATOR", sequenceName = "user_seq", allocationSize = 50)
public class User extends BaseEntity{

    @NotNull
    @Size(min = 3, max = 20)
    private String name;

    @NotNull
    @Column(nullable = false, unique = true)
    private String username;

    @NotNull
    @Size(min = 3,max = 50)
    private String password;

}
