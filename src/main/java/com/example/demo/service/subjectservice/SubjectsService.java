package com.example.demo.service.subjectservice;

import com.example.demo.enity.Subject;

import java.util.List;

public interface SubjectsService {

    public Subject saveSubjects(Subject subjects);
    public Subject updateSubjects(Subject subjects);
    public List<Subject> findAllSubjects();
    public void deleteById(Integer id);
}
