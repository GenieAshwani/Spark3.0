package com.genie.MappingDemo;

import jakarta.persistence.*;

@Entity
public class Profile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @OneToOne(mappedBy = "profile")
    private Student student;
}
