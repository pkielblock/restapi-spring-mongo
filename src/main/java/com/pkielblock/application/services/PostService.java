package com.pkielblock.application.services;

import com.pkielblock.application.domain.Post;
import com.pkielblock.application.domain.User;
import com.pkielblock.application.repositories.PostRepository;
import com.pkielblock.application.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;
    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object Not Found"));
    }

    public List<Post> findByTitle(String text) {
        return repository.searchTitle(text);
    }
}
