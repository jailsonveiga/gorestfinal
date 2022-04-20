package com.example.gorestfinal.validation;

import com.example.gorestfinal.models.Post;
import com.example.gorestfinal.repositories.PostRepository;

public class PostValidation {

    public static ValidationError validatePost(Post post, PostRepository postRepository, boolean isUpdating) {

        ValidationError errors = new ValidationError();

        // Validated data for post

        // Validation Errors
        return errors;
    }
}
