package com.clover.seismicactivitymonitor.repositories;

import com.clover.seismicactivitymonitor.models.Earthquake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarthquakeRepository extends CrudRepository<Earthquake, Long> {

}
