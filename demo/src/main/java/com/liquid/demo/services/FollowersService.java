package com.liquid.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liquid.demo.dtos.request.CreateFollowers;
import com.liquid.demo.entities.DrinksEntity;
import com.liquid.demo.entities.FollowersEntity;
import com.liquid.demo.repositories.FollowersRepository;

@Service
public class FollowersService {
    
    @Autowired
    FollowersRepository followersRepository;

    public List<DrinksEntity> getAllFollowers() {
        return followersRepository.findAll();
    }

    public void createDrink(CreateFollowers dto) {
        FollowersEntity entity = new FollowersEntity();
        entity.setNameTracked(dto.getNameTracked());
        followersRepository.save(entity);
    }
}
