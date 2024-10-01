package com.kristian.review_service.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long gameId;
    private String comment;
    private int rating;

    // Getters and Setters
}
