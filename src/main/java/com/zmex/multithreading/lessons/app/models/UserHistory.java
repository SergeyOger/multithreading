package com.zmex.multithreading.lessons.app.models;

import lombok.Data;

import java.util.List;

@Data
public class UserHistory {

    private User user;

    private List<PostHistory> postHistory;
}
