package com.example.demo.service.hobbieservice;

import com.example.demo.enity.Hobbies;
import com.example.demo.enity.Student;

import java.util.List;

public interface HobbiesService {
    public Hobbies saveHobbies(Hobbies hobbies);
    public  Hobbies updateHobbies( Hobbies hobbies);
    public List< Hobbies> findAllHobbies();
    public void deleteById(Integer id);
}

