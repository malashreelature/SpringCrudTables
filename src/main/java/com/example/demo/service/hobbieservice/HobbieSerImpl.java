package com.example.demo.service.hobbieservice;

import com.example.demo.enity.Hobbies;
import com.example.demo.enity.Student;
import com.example.demo.repository.HobbiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HobbieSerImpl implements HobbiesService{
    @Autowired
    private HobbiesRepo hobbiesRepo;
    @Override
    public Hobbies saveHobbies(Hobbies hobbies) {
        return hobbiesRepo.save(hobbies);
    }


    @Override
    public Hobbies updateHobbies(Hobbies hobbies) {
        return hobbiesRepo.save(hobbies);
    }

    @Override
    public List<Hobbies> findAllHobbies() {
        return (List<Hobbies>) hobbiesRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        hobbiesRepo.deleteById(id);
    }
}
