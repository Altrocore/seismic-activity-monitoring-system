package com.clover.seismicactivitymonitor.services;

import java.util.Optional;

public interface GeothermalEventService<T> {
    T saveEvent(T event);
    Optional<T> getEventById(Long id);
    Iterable<T> getAllEvents();
    void deleteEvent(Long id);
}
