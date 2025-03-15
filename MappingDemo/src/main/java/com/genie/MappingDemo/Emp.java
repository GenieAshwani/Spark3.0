package com.genie.MappingDemo;

import jakarta.persistence.*;
import org.springframework.cache.annotation.EnableCaching;


@Entity
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name="dep_id")
    private Dep dep;
}
