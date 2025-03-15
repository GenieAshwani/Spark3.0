package com.genie.MappingDemo;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Dep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "dep",cascade = CascadeType.ALL)
    private List<Emp> empList;
}
