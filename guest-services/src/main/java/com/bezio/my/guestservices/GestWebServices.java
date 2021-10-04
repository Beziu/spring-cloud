package com.bezio.my.guestservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GestWebServices {

    private final GuestRepository repository;

    public GestWebServices (GuestRepository repository) {
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Guest> getAllGuest() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Guest gertGuest(@PathVariable("id") long id) {
        return this.repository.findById(id).get();
    }

}
