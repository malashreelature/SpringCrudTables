package com.example.demo.service.studentservice;

import com.example.demo.enity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public Student updateStudent(Student student);
    public List<Student> findAllStudent();
    public void deleteById(Integer id);
}

