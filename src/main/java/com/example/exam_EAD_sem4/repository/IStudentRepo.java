package com.example.exam_EAD_sem4.repository;

import com.example.exam_EAD_sem4.entity.Student_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student_t, Integer> {

}
