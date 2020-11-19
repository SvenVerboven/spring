package com.hobby.spring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PET")
public class Pet {

    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
}
