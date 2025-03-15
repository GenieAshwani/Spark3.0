package com.genie.MappingDemo;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany(mappedBy = "course")
    private List<Student> student;
}
