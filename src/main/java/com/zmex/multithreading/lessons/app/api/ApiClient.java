package com.zmex.multithreading.lessons.app.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zmex.multithreading.lessons.app.models.Comment;
import com.zmex.multithreading.lessons.app.models.Post;
import com.zmex.multithreading.lessons.app.models.User;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ApiClient {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    private final HttpClient httpClient;

    private final ObjectMapper objectMapper;

    public ApiClient() {
        this.httpClient = HttpClient.newBuilder().build();
        this.objectMapper = new ObjectMapper();
    }

    public List<User> getUsers() {
        URI uri = URI.create(BASE_URL + "/users");
        final HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
        try {
            final HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            TypeReference<List<User>> usersReference = new TypeReference<>() {
            };

            return objectMapper.readValue(response.body(), usersReference);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Post> getUserPosts(int userId) {
        try {
            URI uri = new URIBuilder().setScheme("https").setHost("jsonplaceholder.typicode.com")
                    .setPathSegments("posts").setParameter("userId", String.valueOf(userId)).build();
            final HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
            final HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            TypeReference<List<Post>> postsReference = new TypeReference<>() {
            };

            return objectMapper.readValue(response.body(), postsReference);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Comment> getPostComments(int postId) {
        try {
            URI uri = new URIBuilder().setScheme("https").setHost("jsonplaceholder.typicode.com")
                    .setPathSegments("comments").setParameter("postId", String.valueOf(postId)).build();
            final HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
            final HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            TypeReference<List<Comment>> postsReference = new TypeReference<>() {
            };

            return objectMapper.readValue(response.body(), postsReference);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
