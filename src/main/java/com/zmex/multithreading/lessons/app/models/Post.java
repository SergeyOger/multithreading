package com.zmex.multithreading.lessons.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

    private int userId;

    private int id;

    private String title;
}
