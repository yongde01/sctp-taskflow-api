package com.taskflow.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private String priority;

    private LocalDate dueDate;

    @Column(nullable = false)
    private Boolean completed;

    public Task() {
        this.completed = false;
    }

    public Task(Long id, String title, String description, String priority,
                LocalDate dueDate, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = completed;
    }
}
