package com.example.demo.service.studentservice;

import com.example.demo.enity.Hobbies;
import com.example.demo.enity.Student;
import com.example.demo.enity.Subject;
import com.example.demo.repository.HobbiesRepo;
import com.example.demo.repository.StudentRepo;
import com.example.demo.repository.SubjectsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentSerImpl implements StudentService {
@Autowired
private StudentRepo studentRepo;
//@Autowired
//private SubjectsRepo subjectRepo;
//@Autowired
//private HobbiesRepo hobbiesRepo;
    @Override
    public Student saveStudent(Student student) {
        return  studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        studentRepo.deleteById(id);

    }

   /* public Student assignStudentToHobbiesToSubject(Integer stdid, Integer hobbid, Integer subid) {
         Set<Hobbies> hobbiesSet=null;
        Set<Subject> subjectsSet=null;
        Student student=studentRepo.findById(stdid).get();
        Hobbies hobbies=hobbiesRepo.findById(hobbid).get();
        Subject subjects=subjectRepo.findById(subid).get();
        hobbiesSet=student.getHobbies();
        subjectsSet=student.getSubjects();
        hobbiesSet.add(hobbies);
        subjectsSet.add(subjects);
        student.setHobbies(hobbiesSet);
        student.setSubjects(subjectsSet);
        return studentRepo.save(student);
    }*/
}

