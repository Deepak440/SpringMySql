package com.example.Alien.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
// Specify Primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  long id;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "Email")
    private String email;

}
