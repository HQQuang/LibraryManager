package com.librarymanager.finalproject.entity.Book;

import com.librarymanager.finalproject.entity.Author.Author;
import com.librarymanager.finalproject.entity.Category.Category;
import com.librarymanager.finalproject.entity.Publisher.Publisher;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "publishingYear")
    private int publishingYear;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "status")
    private int status;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "updateBy")
    private String updateBy;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category categoryId;

    @ManyToOne
    @JoinColumn(name = "publisherId")
    private Publisher publisherId;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author authorId;

}
