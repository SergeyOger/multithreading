package com.zmex.multithreading.lessons.app.scrapper;

import com.zmex.multithreading.lessons.app.api.ApiClient;
import com.zmex.multithreading.lessons.app.models.Post;
import com.zmex.multithreading.lessons.app.models.User;

import java.util.List;
import java.util.concurrent.Callable;

public class PostScraper implements Callable<List<Post>> {

    private final ApiClient apiClient;

    private final User user;

    public PostScraper(ApiClient apiClient, User user) {
        this.apiClient = apiClient;
        this.user = user;
    }


    @Override
    public List<Post> call() {
        return apiClient.getUserPosts(user.getId());
    }
}
