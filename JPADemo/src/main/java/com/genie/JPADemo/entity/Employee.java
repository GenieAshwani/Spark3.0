package com.genie.JPADemo.entity;


import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "empName")
    private String name;

    @Column(name = "empSal")
    private double salary;

    @Column(name = "empDep")
    private String dep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Employee(int id, String name, double salary, String dep) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

   public Employee()
    {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dep='" + dep + '\'' +
                '}';
    }
}
