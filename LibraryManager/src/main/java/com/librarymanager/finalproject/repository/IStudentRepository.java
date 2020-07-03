package com.librarymanager.finalproject.repository;

import com.librarymanager.finalproject.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Integer> {

}