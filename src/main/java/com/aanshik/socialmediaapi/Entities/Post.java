package com.aanshik.socialmediaapi.Entities;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Integer id;

    @Column(name = "post_desc")
    private String description;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post() {
    }

    public Post(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
