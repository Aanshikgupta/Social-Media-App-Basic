package com.aanshik.socialmediaapi.Dtos;

public class PostDto {

    private Integer id;


    private String description;


    //Infinite Recursion Problem Here
    //    private UserDto user;
    //
    //    public UserDto getUser() {
    //        return user;
    //    }
    //
    //    public void setUser(UserDto user) {
    //        this.user = user;
    //    }

    public PostDto() {
    }

    public PostDto(String description) {
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
