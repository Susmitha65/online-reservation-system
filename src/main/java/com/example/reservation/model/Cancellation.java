package com.example.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cancellation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pnrNumber;

    // Getters and setters
}
