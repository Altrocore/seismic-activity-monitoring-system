package com.clover.seismicactivitymonitor.controllers;

import com.clover.seismicactivitymonitor.models.VolcanicEruption;
import com.clover.seismicactivitymonitor.services.VolcanicEruptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volcanic_eruptions")
public class VolcanicEruptionController {

    private final VolcanicEruptionService volcanicEruptionService;

    @Autowired
    public VolcanicEruptionController(VolcanicEruptionService volcanicEruptionService) {
        this.volcanicEruptionService = volcanicEruptionService;
    }

    @PostMapping
    public VolcanicEruption createVolcanicEruption(@RequestBody VolcanicEruption volcanicEruption) {
        return volcanicEruptionService.saveEvent(volcanicEruption);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VolcanicEruption> getVolcanicEruptionById(@PathVariable Long id) {
        return volcanicEruptionService.getEventById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public Iterable<VolcanicEruption> getAllVolcanicEruptions() {
        return volcanicEruptionService.getAllEvents();
    }

    @DeleteMapping("/{id}")
    public void deleteVolcanicEruption(@PathVariable Long id) {
        volcanicEruptionService.deleteEvent(id);
    }
}
