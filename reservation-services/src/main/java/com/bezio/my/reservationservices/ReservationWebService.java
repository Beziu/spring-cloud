package com.bezio.my.reservationservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationWebService {

    private final ReservationRepository repository;

    public ReservationWebService (ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }

}
