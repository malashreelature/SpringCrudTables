package com.example.demo.repository;

import com.example.demo.enity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepo extends JpaRepository<Subject,Integer> {
}
