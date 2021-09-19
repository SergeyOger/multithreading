package com.zmex.multithreading.lessons.app.scrapper;

import com.zmex.multithreading.lessons.app.api.ApiClient;
import com.zmex.multithreading.lessons.app.models.Comment;
import com.zmex.multithreading.lessons.app.models.Post;

import java.util.List;
import java.util.concurrent.Callable;

public class CommentsScrapper implements Callable<List<Comment>> {

    private final Post post;

    private final ApiClient apiClient;

    public CommentsScrapper(ApiClient apiClient, Post post) {
        this.apiClient = apiClient;
        this.post = post;
    }

    @Override
    public List<Comment> call() {
        return apiClient.getPostComments(post.getId());
    }
}
