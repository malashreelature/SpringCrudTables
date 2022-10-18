package com.example.demo.controller.studentController;

import com.example.demo.enity.Student;
import com.example.demo.service.hobbieservice.HobbieSerImpl;
import com.example.demo.service.studentservice.StudentSerImpl;
import com.example.demo.service.subjectservice.SubjectSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentSerImpl studeSerImpl;


    @PostMapping(value = "saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        studeSerImpl.saveStudent(student);
        return student;
    }

    @GetMapping(value = "getAllstudent")
    public List<Student> findAllStudent() {
        return studeSerImpl.findAllStudent();
    }

    @PutMapping(value = "updatestudent")
    public Student updateStudent(@RequestBody Student student) {
        return studeSerImpl.updateStudent(student);
    }

    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        System.out.println("deleted student");
        studeSerImpl.deleteById(id);

    }




}
