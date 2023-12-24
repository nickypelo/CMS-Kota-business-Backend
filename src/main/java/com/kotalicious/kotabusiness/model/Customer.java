package com.kotalicious.kotabusiness.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name="customer")
public class Customer {

    @Id
    private String id;
    @Column("firstName")
    private String firstname;
    @Column("lastName")
    private String lastname;
    @Column("userName")
    private String username;
    @Column("email")
    private String email;
    @Column("password")
    private String password;

}
