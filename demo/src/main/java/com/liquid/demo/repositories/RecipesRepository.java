package com.liquid.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.liquid.demo.entities.RecipesEntity;

@Repository
public interface RecipesRepository extends JpaRepository<RecipesEntity, Long> {

}