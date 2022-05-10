package com.example.spring_boot_db_demo.repository;

import com.example.spring_boot_db_demo.entity.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository  extends CrudRepository<Student, Long> {

    List<Student> findByName(String name);
}
