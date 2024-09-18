package com.liquid.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "followers")
public class FollowersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "followers_id")
    private long idFollower;

    @Column(name = "name_tracked")
    private String nameTracked;

    @ManyToOne
    @JoinColumn("id_user")
    private User user;

    public long getIdFollower() {
        return idFollower;
    }

    public void setIdFollower(long idFollower) {
        this.idFollower = idFollower;
    }

    public String getNameTracked() {
        return nameTracked;
    }

    public void setNameTracked(String nameTracked) {
        this.nameTracked = nameTracked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
