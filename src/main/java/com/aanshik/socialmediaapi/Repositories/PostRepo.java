package com.aanshik.socialmediaapi.Repositories;

import com.aanshik.socialmediaapi.Entities.Post;
import com.aanshik.socialmediaapi.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findAllByUser(User user);

}
