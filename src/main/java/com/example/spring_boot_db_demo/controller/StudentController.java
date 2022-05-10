package com.example.spring_boot_db_demo.controller;

import com.example.spring_boot_db_demo.entity.Student;
import com.example.spring_boot_db_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
