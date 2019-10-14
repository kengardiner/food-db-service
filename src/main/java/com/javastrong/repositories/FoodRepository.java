package com.javastrong.repositories;

import com.javastrong.model.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findByFoodType(String foodType);

    Food findByFoodName(String foodName);

    Food findById(long id);
}
