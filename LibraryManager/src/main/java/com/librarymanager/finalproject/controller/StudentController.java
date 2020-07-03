package com.librarymanager.finalproject.controller;

import com.librarymanager.finalproject.entity.Student;
import com.librarymanager.finalproject.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private IStudentRepository iStudentRepository;

    @GetMapping(value = "")
    public ResponseEntity<List<Student>> getListStudent()
    {
        List<Student> students = (List<Student>) iStudentRepository.findAll();
        return ResponseEntity.ok(students);
    }
}
