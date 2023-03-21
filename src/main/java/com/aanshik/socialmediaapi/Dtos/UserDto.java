package com.aanshik.socialmediaapi.Dtos;

import com.aanshik.socialmediaapi.Entities.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDto {


    private Integer id;

    private String name;


    private Date dob;

    private List<PostDto> posts = new ArrayList<>();

    public List<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDto> posts) {
        this.posts = posts;
    }

    public UserDto() {
    }

    public UserDto(String name, Date dob) {
        this.name = name;
        this.dob = dob;
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
