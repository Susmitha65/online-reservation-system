package com.example.reservation.controller;

import com.example.reservation.model.Cancellation;
import com.example.reservation.service.CancellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cancellation")
public class CancellationController {
    @Autowired
    private CancellationService cancellationService;

    @PostMapping
    public Cancellation cancelReservation(@RequestBody Cancellation cancellation) {
        return cancellationService.saveCancellation(cancellation);
    }
}
