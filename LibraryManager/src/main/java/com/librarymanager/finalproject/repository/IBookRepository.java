package com.librarymanager.finalproject.repository;

import com.librarymanager.finalproject.entity.Book.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends CrudRepository<Book, Integer> {
    @Query(value ="SELECT * FROM Book b Where b.category_id = :categoryId", nativeQuery = true)
    List<Book> getBook(@Param("categoryId") Integer categoryId);

}