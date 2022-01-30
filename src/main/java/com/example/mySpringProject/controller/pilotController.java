package com.example.mySpringProject.controller;

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
    public Iterable<pilot> getAllPilots() {
        Iterable<pilot> pilots = pilotRepository.findAll();
        return this.pilotRepository.findall();
    }

    @PostMapping(path = "/addNew")
    public String createNewPilot(@RequestBody pilot p) {
        pilotRepository.save(p);
        return "New Pilot successfully added!";
    }

    @GetMapping(path = "/{id}")
    public Optional<pilot> getPilotById(@PathVariable("id") Integer id) {

        return this.pilotRepository.findById(id);
    }
}