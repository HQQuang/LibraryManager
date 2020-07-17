package com.librarymanager.finalproject.controller;

import com.librarymanager.finalproject.entity.Book.Book;
import com.librarymanager.finalproject.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private IBookRepository iBookRepository;

    @GetMapping(value = "getAll")
    public ResponseEntity<List<Book>> getListStudent(@RequestParam("id") Integer id)
    {
        List<Book> books = iBookRepository.getBook(id);

        return ResponseEntity.ok(books);
    }
}
