package com.clover.seismicactivitymonitor.controllers;

import com.clover.seismicactivitymonitor.models.Earthquake;
import com.clover.seismicactivitymonitor.services.EarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/earthquakes")
public class EarthquakeController {
    private final EarthquakeService earthquakeService;

    @Autowired
    public EarthquakeController(EarthquakeService earthquakeService) {
        this.earthquakeService = earthquakeService;
    }

    @PostMapping
    public Earthquake createEarthquake(@RequestBody Earthquake earthquake) {
        return earthquakeService.saveEvent(earthquake);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Earthquake> getEarthquakeById(@PathVariable Long id) {
        return earthquakeService.getEventById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public Iterable<Earthquake> getAllEarthquakes() {
        return earthquakeService.getAllEvents();
    }

    @DeleteMapping("/{id}")
    public void deleteEarthquake(@PathVariable Long id) {
        earthquakeService.deleteEvent(id);
    }
}
