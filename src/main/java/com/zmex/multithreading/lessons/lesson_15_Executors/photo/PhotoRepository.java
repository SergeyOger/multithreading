package com.zmex.multithreading.lessons.lesson_15_Executors.photo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zmex.multithreading.lessons.lesson_15_Executors.model.Photo;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.List;

@Slf4j
public class PhotoRepository {

    private static final String REPOSITORY_URL = "https://jsonplaceholder.typicode.com/photos";

    private final HttpClient httpClient;

    private final ObjectMapper objectMapper;

    public PhotoRepository() {
        this.httpClient = HttpClientBuilder.create().build();
        this.objectMapper = new ObjectMapper();
    }

    public List<Photo> findAll() {
        HttpGet request = new HttpGet(REPOSITORY_URL);
        try {
            HttpResponse response = httpClient.execute(request);
            return objectMapper.readValue(response.getEntity().getContent(), new TypeReference<>() {
            });

        } catch (Exception ex) {
            log.error("Sending request failed, {}", ex.getMessage());
            throw new RuntimeException("Sending request failed " + ex.getMessage());
        }
    }
}
