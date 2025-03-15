package com.genie.WebDemo.controller;


import com.genie.WebDemo.Service.StudentService;
import com.genie.WebDemo.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

        @Autowired
        private StudentService service;
        @GetMapping("/getAll")
        public List<Student> getAllStudent()
        {
                System.out.println("controller running....");
                List<Student> allStudents = service.getAllStudents();
                return  allStudents;
        }

        @PostMapping("/save")
        public Student inserData(@RequestBody Student student)
        {
                System.out.println(student);
                service.saveStudent(student);
                return student;
        }

        @DeleteMapping("/{id}")
        public void deleteStudentById(@PathVariable int id){

                System.out.println("Student id "+ id);

                service.deleteStudentById(id);
        }

}
