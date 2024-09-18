package com.liquid.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liquid.demo.dtos.request.CreateFollowers;
import com.liquid.demo.services.FollowersService;

@RestController
@RequestMapping("/followers")
public class FollowersController {
    @Autowired
    FollowersService followersService;

    @GetMapping("/followers-user")
    public ResponseEntity<?> getFollowers() {
        var followers = followersService.getAllFollowers();

        return ResponseEntity.ok(followers);
    }

    @PostMapping("/followers-follow")
    public ResponseEntity<?> postFollowers(@RequestBody CreateFollowers dto){
        followersService.createFollowers(dto);

        return ResponseEntity.ok(dto);
    }
}
