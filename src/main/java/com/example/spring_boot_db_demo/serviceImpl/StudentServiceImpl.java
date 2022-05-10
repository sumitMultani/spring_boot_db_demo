package com.example.spring_boot_db_demo.serviceImpl;

import com.example.spring_boot_db_demo.entity.Student;
import com.example.spring_boot_db_demo.repository.StudentRepository;
import com.example.spring_boot_db_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentrepository;

    @Override
    public List<Student> getAllStudent() {
        studentrepository.findAll();
        List<Student> studentList = new ArrayList<>();
        for (Student student : studentrepository.findAll()) {
            studentList.add(student);
        }
        return studentList;
    }
}
