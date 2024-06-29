package com.example.reservation.service;

import com.example.reservation.model.Cancellation;
import com.example.reservation.repository.CancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancellationService {
    @Autowired
    private CancellationRepository cancellationRepository;

    public Cancellation saveCancellation(Cancellation cancellation) {
        return cancellationRepository.save(cancellation);
    }
}
