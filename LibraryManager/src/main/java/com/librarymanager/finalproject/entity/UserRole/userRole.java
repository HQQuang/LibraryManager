package com.librarymanager.finalproject.entity.UserRole;

import com.librarymanager.finalproject.entity.Role.Role;
import com.librarymanager.finalproject.entity.User.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table
public class userRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
    @JoinColumn(name = "roleId")
    private Role roleId;
}
