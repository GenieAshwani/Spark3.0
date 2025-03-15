package com.genie.WebDemo.Service;


import com.genie.WebDemo.Repo.StudentRepo;
import com.genie.WebDemo.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents()
    {
        /*StudentRepo studentRepo=new StudentRepo();
        studentRepo.getAllStudent();*/
        System.out.println("Service running...");
        List<Student> allStudent = studentRepo.getAllStudent();
        return allStudent;
    }

    public void saveStudent(Student student) {
        studentRepo.saveStudent(student);
    }

    public void deleteStudentById(int id) {

        studentRepo.deleteStudentById(id);
    }
}
