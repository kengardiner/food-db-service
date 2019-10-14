package com.javastrong.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
    public class Food {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String foodType;
        private String foodName;
        private int murlsPerDollar;
        private int rating;

    public Food(String foodType, String foodName, int murlsPerDollar, int rating) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.murlsPerDollar = murlsPerDollar;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getMurlsPerDollar() {
        return murlsPerDollar;
    }

    public void setMurlsPerDollar(int murlsPerDollar) {
        this.murlsPerDollar = murlsPerDollar;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
