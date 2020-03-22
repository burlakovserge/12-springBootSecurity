package com.example.toDoList.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String commentary;

    public Task(String name, String commentary) {
        this.name = name;
        this.commentary = commentary;
    }

    }
