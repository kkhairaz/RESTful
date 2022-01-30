package com.example.mySpringProject.controller;

import Repositories.pilotRepository

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.lang.Iterable;
import java.util.Date;

@RestController
@RequestMapping("/pilots")
public class pilotController {
    private final pilotRepository pilotRepository;

    public pilotController(pilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;

    }

    @GetMapping()
    public Iterable<pilot> getPilots() {
        Iterable<pilot> pilots = pilotRepository.findAll();
        return pilots;
    }

    @PostMapping(path = "/addNew")
    public String createNewPilot(@RequestBody pilot p) {
        pilotRepository.save(p);
        return "New Pilot successfully added!";
    }

}

    @GetMapping(path = "/{id}")
    public Iterable<pilot> getPilotById(@PathVariable String id) {
        Iterable<pilot> the_pilot = pilotRepository.findById(id);
        return the_pilot;
    }
}