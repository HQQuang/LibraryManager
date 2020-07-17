package com.librarymanager.finalproject.entity.Category;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "forfeit")
    private String forfeit;

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

}
