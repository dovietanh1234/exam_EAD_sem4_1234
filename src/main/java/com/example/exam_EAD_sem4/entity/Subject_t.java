package com.example.exam_EAD_sem4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "subject_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject_t {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subject_id;
    private String subject_code;
    private String subject_name;
    private int credit;

}
