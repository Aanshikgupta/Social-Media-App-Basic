package com.aanshik.socialmediaapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {


    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;


    @Column(name = "user_name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "user_dob")
    private Date dob;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();


    public User() {

    }

    public User(String name, Date dob) {
        posts = new ArrayList<>();
        this.name = name;
        this.dob = dob;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
