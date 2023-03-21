package com.aanshik.socialmediaapi.Services.ServiceImpl;

import com.aanshik.socialmediaapi.Dtos.UserDto;
import com.aanshik.socialmediaapi.Entities.User;
import com.aanshik.socialmediaapi.ExceptionHandlers.ResourceNotFoundException;
import com.aanshik.socialmediaapi.Repositories.UserRepo;
import com.aanshik.socialmediaapi.Services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User userToBeCreated=this.modelMapper.map(userDto,User.class);
        User userCreated=userRepo.save(userToBeCreated);
        return this.modelMapper.map(userCreated,UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer id) {
        User user=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User",id));
        user.setDob(userDto.getDob());
        user.setName(userDto.getName());
        User userUpdated=userRepo.save(user);
        return this.modelMapper.map(userUpdated,UserDto.class);
    }

    @Override
    public Boolean deleteUser(Integer id) {
        User user=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User",id));
        try{
            userRepo.delete(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public UserDto getById(Integer id) {
        User user=userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User",id));
        return this.modelMapper.map(user,UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users=userRepo.findAll();
        List<UserDto> userDtoList=users.stream().map((user -> this.modelMapper.map(user,UserDto.class))).collect(Collectors.toList());
        return userDtoList;
    }
}
