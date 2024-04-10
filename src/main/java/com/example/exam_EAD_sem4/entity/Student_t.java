package com.example.exam_EAD_sem4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "student_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student_t {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String student_code;
    private String full_name;
    private String address;
}
