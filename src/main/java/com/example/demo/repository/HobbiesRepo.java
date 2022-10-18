package com.example.demo.repository;

import com.example.demo.enity.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbiesRepo extends JpaRepository<Hobbies,Integer> {
}
