package com.genie.WebDemo.dto;

public class Student {

    private int id;
    private String name;
    private String add;
    private String course;

    public Student(int id, String name, String add, String course) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.course = course;
    }

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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", course=" + course +
                '}';
    }
}
