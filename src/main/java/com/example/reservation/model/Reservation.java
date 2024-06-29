package com.example.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trainNumber;
    private String trainName;
    private String classType;
    private Date dateOfJourney;
    private String fromPlace;
    private String toDestination;

    // Getters and setters
}
