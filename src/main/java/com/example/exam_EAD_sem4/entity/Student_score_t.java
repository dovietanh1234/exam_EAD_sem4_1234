package com.example.exam_EAD_sem4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "student_score_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student_score_t {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_score_id;
    private double score1;
    private double score2;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student_t student;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject_t subject;

    private String Grade;

}
