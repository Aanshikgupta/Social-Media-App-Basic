package com.aanshik.socialmediaapi.Services.ServiceImpl;

import com.aanshik.socialmediaapi.Dtos.PostDto;
import com.aanshik.socialmediaapi.Dtos.UserDto;
import com.aanshik.socialmediaapi.Entities.Post;
import com.aanshik.socialmediaapi.Entities.User;
import com.aanshik.socialmediaapi.ExceptionHandlers.ResourceNotFoundException;
import com.aanshik.socialmediaapi.Repositories.PostRepo;
import com.aanshik.socialmediaapi.Repositories.UserRepo;
import com.aanshik.socialmediaapi.Services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    //TODO:Problem here
    @Override
    public List<PostDto> getAllPostsByUser(Integer userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
        List<Post> posts = postRepo.findAllByUser(user);

        List<PostDto> postDtos = posts.stream().map((post) -> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

        return postDtos;
    }

    @Override
    public PostDto createPost(PostDto postDto, Integer userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", userId));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setUser(user);
//        userRepo.save(user);
        Post postSaved=postRepo.save(post);

        return this.modelMapper.map(postSaved, PostDto.class);
    }

    @Override
    public Boolean deletePost(Integer postId, Integer userId) {
        return false;
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer userId, Integer postId) {
        return null;
    }

    @Override
    public PostDto getPostById(Integer userId, Integer postId) {
        return null;
    }

}
