package com.abiproject.taskmanager.Entity;

import com.abiproject.taskmanager.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="title", nullable = false, length=500)
    private String title;
    @Column(name="description", nullable = false, length=500)
    private String description;
    @Column(name="is_completed", nullable = false, length=500)
    @Enumerated(EnumType.STRING)
    private Status completed;


}
