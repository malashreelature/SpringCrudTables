package com.example.demo.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name = "hobbies")
@Entity
public class Hobbies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String hobbies;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, targetEntity=Student.class)
    @JoinColumn(name = "student_id", insertable = false, updatable = false)

    private Student student;

    public Hobbies(Integer hid, String hobbies) {
        id = hid;
        this.hobbies = hobbies;

    }
    Hobbies(){

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

    public String getHobbies() {
        return hobbies;
    }


    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


}
