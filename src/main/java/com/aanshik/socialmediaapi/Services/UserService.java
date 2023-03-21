package com.aanshik.socialmediaapi.Services;

import com.aanshik.socialmediaapi.Dtos.UserDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    //create
    public UserDto createUser(UserDto userDto);

    //update
    public UserDto updateUser(UserDto userDto,Integer id);

    //delete
    public Boolean deleteUser(Integer id);

    // getById
    public UserDto getById(Integer id);


    //getAll
    public List<UserDto> getAllUsers();
}
