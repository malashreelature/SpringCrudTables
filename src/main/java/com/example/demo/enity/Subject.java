package com.example.demo.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="subjects")
public class Subject {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        private String author;
        private String name;
        @JsonIgnore

        @ManyToOne(fetch = FetchType.LAZY, targetEntity=Student.class)
        @JoinColumn(name = "student_id", insertable = false, updatable = false)

    private Student student;

         public Subject(Integer id, String author, String name,Student student) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.student =student;
    }
    Subject(){

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



