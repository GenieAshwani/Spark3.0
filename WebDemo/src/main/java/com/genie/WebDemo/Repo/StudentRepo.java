package com.genie.WebDemo.Repo;


import com.genie.WebDemo.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> studentList=new ArrayList<>();
    public List<Student> getAllStudent()
    {
        System.out.println("repo running....");

        Student s1=new Student(1,"Ayush","Delhi","JFS");
        Student s2=new Student(2,"kiriti","Agra","DSA");
        Student s3=new Student(3,"biswarup","Bengal","JFS");
        Student s4=new Student(4,"pushkar","pune","DSA");
        Student s5=new Student(5,"Raj","Bihar","JFS");
        Student s6=new Student(6,"Shoaib","ranchi","DSA");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }

    public void saveStudent(Student student) {

        studentList.add(student);
        System.out.println("Student saved!");
    }

    public void deleteStudentById(int id) {
        for(Student student:studentList)
        {
            if(student.getId()==id)
            {
                studentList.remove(student);
                System.out.println("Student Deleted");
                break;
            }
        }
    }
}
