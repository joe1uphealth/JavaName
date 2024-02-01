package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class NameStorage {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

}
