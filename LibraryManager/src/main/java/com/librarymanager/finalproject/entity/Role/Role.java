package com.librarymanager.finalproject.entity.Role;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

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
