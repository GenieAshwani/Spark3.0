package com.genie.MappingDemo;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id", referencedColumnName = "id")
    private Profile profile;

    @ManyToMany
    @JoinTable(
            name ="student_course",
            joinColumns= @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id")

    )
    List<Course> batches;

}
