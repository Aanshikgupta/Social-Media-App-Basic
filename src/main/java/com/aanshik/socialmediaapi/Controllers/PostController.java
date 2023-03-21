package com.aanshik.socialmediaapi.Controllers;

import com.aanshik.socialmediaapi.Dtos.PostDto;
import com.aanshik.socialmediaapi.Entities.Post;
import com.aanshik.socialmediaapi.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/{userId}")
    public List<PostDto> getAllPostByUser(@PathVariable Integer userId){
        return postService.getAllPostsByUser(userId);
    }

    @PostMapping("/{userId}")
    public PostDto createPost(@RequestBody PostDto postDto,@PathVariable Integer userId){
        return postService.createPost(postDto,userId);
    }






}
