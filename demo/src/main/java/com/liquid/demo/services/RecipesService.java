package com.liquid.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liquid.demo.dtos.request.CreateDrink;
import com.liquid.demo.entities.DrinksEntity;
import com.liquid.demo.entities.RecipesEntity;
import com.liquid.demo.repositories.DrinksRepository;
import com.liquid.demo.repositories.RecipesRepository;

@Service
public class RecipesService {
    
    @Autowired
    RecipesRepository recipesRepository;

    public List<RecipesEntity> getAllRecipes() {
        
        return  recipesRepository.findAll();
    }

    public void createRecipe(CreateRecipe dto) {
        RecipesEntity entity = new RecipesEntity();
        entity.setTitulo(dto.getTitulo());
        recipesRepository.save(entity);
    }

}
