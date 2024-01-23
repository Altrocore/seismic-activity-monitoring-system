package com.clover.seismicactivitymonitor.services;

import com.clover.seismicactivitymonitor.models.VolcanicEruption;
import com.clover.seismicactivitymonitor.repositories.VolcanicEruptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VolcanicEruptionService implements GeothermalEventService<VolcanicEruption> {
    private final VolcanicEruptionRepository volcanicEruptionRepository;

    @Autowired
    public VolcanicEruptionService(VolcanicEruptionRepository volcanicEruptionRepository) {
        this.volcanicEruptionRepository = volcanicEruptionRepository;
    }

    @Override
    public VolcanicEruption saveEvent(VolcanicEruption volcanicEruption) {
        return volcanicEruptionRepository.save(volcanicEruption);
    }

    @Override
    public Optional<VolcanicEruption> getEventById(Long id) {
        return volcanicEruptionRepository.findById(id);
    }

    @Override
    public Iterable<VolcanicEruption> getAllEvents() {
        return volcanicEruptionRepository.findAll();
    }

    @Override
    public void deleteEvent(Long id) {
        volcanicEruptionRepository.deleteById(id);
    }
}
