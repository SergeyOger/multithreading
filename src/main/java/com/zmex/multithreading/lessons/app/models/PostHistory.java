package com.zmex.multithreading.lessons.app.models;

import lombok.Data;

import java.util.List;

@Data
public class PostHistory {

    private Post post;

    private List<Comment> comments;

}
