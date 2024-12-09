package com.example.employee_database.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String client;

    @OneToMany(mappedBy = "project")
    private List<Employee> employees;
}
