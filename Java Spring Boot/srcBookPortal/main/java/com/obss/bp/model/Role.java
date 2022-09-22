package com.obss.bp.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "role_seq")
@Entity
public class Role extends BaseEntity{

    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleType type;

}
