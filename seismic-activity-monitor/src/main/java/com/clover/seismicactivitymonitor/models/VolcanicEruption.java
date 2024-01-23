package com.clover.seismicactivitymonitor.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VolcanicEruption extends GeothermalEvent {
    private String eruptionType;
    private Double ashVolume;
}
