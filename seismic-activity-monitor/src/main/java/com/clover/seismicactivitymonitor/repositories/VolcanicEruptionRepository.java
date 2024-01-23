package com.clover.seismicactivitymonitor.repositories;

import com.clover.seismicactivitymonitor.models.VolcanicEruption;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolcanicEruptionRepository extends CrudRepository<VolcanicEruption, Long> {

}
