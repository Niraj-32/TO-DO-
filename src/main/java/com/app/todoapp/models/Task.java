package com.app.todoapp.models;

import jakarta.persistence.*;

import lombok.Data;


@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;

}
