package com.anna.Cardapio.controller;

import com.anna.Cardapio.food.Food;
import com.anna.Cardapio.food.FoodRepository;
import com.anna.Cardapio.food.FoodRequestDTO;
import com.anna.Cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/food")
public class FoodController {

    @RequestMapping("/food")
    public String showFoodPage() {
        return "food";
    }
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<String> saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return ResponseEntity.status(HttpStatus.CREATED).body("Food created successfully");
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = repository.findAll()
                .stream()
                .map(FoodResponseDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(foodList).getBody();
    }

}
