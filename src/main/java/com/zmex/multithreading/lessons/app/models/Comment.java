package com.zmex.multithreading.lessons.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

    private int postId;

    private int id;

    private String name;

    private String body;
}
