package com.librarymanager.finalproject.entity.History;

import com.librarymanager.finalproject.entity.Book.Book;
import com.librarymanager.finalproject.entity.User.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
public class Histories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "borrowTime")
    private Date borrowTime;

    @Column(name = "payTime")
    private Date payTime;

    @Column(name = "borrowDay")
    private int borrowDay;

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
    @JoinColumn(name = "userId")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book bookId;
}
