package com.example.demo.controller.studentController;

import com.example.demo.enity.Subject;
import com.example.demo.service.subjectservice.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {


    @Autowired
        private SubjectsService subSerImpl;


        @PostMapping(value = "saveSubject")
        public Subject saveSubject(@RequestBody Subject subjects) {
            subSerImpl.saveSubjects(subjects);
            System.out.println("Code works properly");
            return subjects;
        }

        @GetMapping(value = "getAllSubject")
        public List<Subject> findAllSubjects() {
            return subSerImpl.findAllSubjects();
        }

        @PutMapping(value = "updateSubject")
        public Subject updateSubject(@RequestBody Subject subjects) {
            return subSerImpl.updateSubjects(subjects);
        }

        @DeleteMapping(value = "delete/{id}")
        public String deleteById(@PathVariable(value = "id") Integer id) {
            subSerImpl.deleteById(id);
            return "deleted id";
        }
    }





