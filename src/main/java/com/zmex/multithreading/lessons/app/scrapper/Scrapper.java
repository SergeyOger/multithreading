package com.zmex.multithreading.lessons.app.scrapper;

import com.zmex.multithreading.lessons.app.api.ApiClient;
import com.zmex.multithreading.lessons.app.models.PostHistory;
import com.zmex.multithreading.lessons.app.models.User;
import com.zmex.multithreading.lessons.app.models.UserHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Scrapper {

    private final ApiClient apiClient;

    private final ExecutorService executorService;

    public Scrapper() {
        this.apiClient = new ApiClient();
        this.executorService = Executors.newFixedThreadPool(10);
    }


    public List<UserHistory> getUserData() {
        List<UserHistory> histories = new ArrayList<>();
        final List<User> users = apiClient.getUsers();
        for (User user : users) {

        }

    }

    private List<PostHistory> getPostHistory(User user) {
        return null;
    }
}
