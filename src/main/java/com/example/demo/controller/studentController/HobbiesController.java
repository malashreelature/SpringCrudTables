package com.example.demo.controller.studentController;

import com.example.demo.enity.Hobbies;
import com.example.demo.service.hobbieservice.HobbieSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hobbies")
public class HobbiesController {

        @Autowired
        private HobbieSerImpl hobbieSerImpl;

        @PostMapping(value = "saveHobbies")
        public Hobbies saveHobbies(@RequestBody Hobbies hobbies) {
            hobbieSerImpl.saveHobbies(hobbies);
            System.out.println("Code works properly");
            return hobbies;
        }

        @GetMapping(value = "getAllHobbies")
        public List<Hobbies> findAllHobbies() {
            return hobbieSerImpl.findAllHobbies();
        }

        @PutMapping(value = "updateModel")
        public Hobbies updateHobbies(@RequestBody Hobbies hobbies) {
            return hobbieSerImpl.updateHobbies(hobbies);
        }

        @DeleteMapping(value = "delete/{id}")
        public String deleteById(@PathVariable(value = "id") Integer id) {
            hobbieSerImpl.deleteById(id);
            return "deleted id";
        }
    }



