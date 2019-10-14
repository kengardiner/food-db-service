package com.javastrong.constructor;

import com.javastrong.model.Food;
import com.javastrong.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodController {

    FoodRepository repository;

    @Autowired
    public FoodController(FoodRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Food getFoodByID (@PathVariable Long id)
    {
        Food food = repository.findById(id).orElse(null);
        System.out.println("the food is: " + food);
        return food;
    }
}
