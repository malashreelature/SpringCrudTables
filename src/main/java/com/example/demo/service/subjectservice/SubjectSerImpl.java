package com.example.demo.service.subjectservice;

import com.example.demo.enity.Subject;
import com.example.demo.repository.SubjectsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectSerImpl implements SubjectsService{
    @Autowired
    private SubjectsRepo subRepo;
    @Override
    public Subject saveSubjects(Subject subjects) {
        return subRepo.save(subjects);
    }

    @Override
    public Subject updateSubjects(Subject subjects) {
        return subRepo.save(subjects);
    }

    @Override
    public List<Subject> findAllSubjects() {
        return  (List<Subject>) subRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        subRepo.deleteById(id);

    }
}
