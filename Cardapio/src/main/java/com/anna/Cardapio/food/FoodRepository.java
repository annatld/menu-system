package com.anna.Cardapio.food;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    Optional<Food> findByTitleAndImageAndPrice(String title, String image, Integer price);
}
