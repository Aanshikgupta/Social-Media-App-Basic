package com.aanshik.socialmediaapi.Services;

import com.aanshik.socialmediaapi.Dtos.PostDto;
import com.aanshik.socialmediaapi.Entities.Post;

import java.util.List;

public interface PostService {


    public List<PostDto> getAllPostsByUser(Integer userId);

    public PostDto createPost(PostDto postDto,Integer userId);

    public Boolean deletePost(Integer postId,Integer userId);

    public PostDto updatePost(PostDto postDto,Integer userId,Integer postId);

    public PostDto getPostById(Integer userId,Integer postId);
}
