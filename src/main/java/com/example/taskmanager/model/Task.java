package com.example.taskmanager.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;   // "PENDING" or "COMPLETED"
    private String priority; // "LOW", "MEDIUM", or "HIGH"
}