package com.clover.seismicactivitymonitor.services;

import com.clover.seismicactivitymonitor.models.Earthquake;
import com.clover.seismicactivitymonitor.repositories.EarthquakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EarthquakeService implements GeothermalEventService<Earthquake> {
    private final EarthquakeRepository earthquakeRepository;

    @Autowired
    public EarthquakeService(EarthquakeRepository earthquakeRepository) {
        this.earthquakeRepository = earthquakeRepository;
    }

    @Override
    public Earthquake saveEvent(Earthquake earthquake) {
        return earthquakeRepository.save(earthquake);
    }

    @Override
    public Optional<Earthquake> getEventById(Long id) {
        return earthquakeRepository.findById(id);
    }

    @Override
    public Iterable<Earthquake> getAllEvents() {
        return earthquakeRepository.findAll();
    }

    @Override
    public void deleteEvent(Long id) {
        earthquakeRepository.deleteById(id);
    }
}
