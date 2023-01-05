package com.example.Excercise4_5_6.controllers;

import com.example.Excercise4_5_6.entities.Laptop;
import com.example.Excercise4_5_6.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public Laptop createLaptop(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
