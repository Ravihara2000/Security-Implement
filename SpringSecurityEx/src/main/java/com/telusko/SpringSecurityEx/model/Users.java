package com.telusko.SpringSecurityEx.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users1")
public class Users {
    @Id
    private int id;
    private String username;
    private String password;


}
