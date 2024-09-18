package com.liquid.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liquid.demo.entities.FollowersEntity;

@Repository
public interface FollowersRepository extends JpaRepository<FollowersEntity, Long> {
    
}
