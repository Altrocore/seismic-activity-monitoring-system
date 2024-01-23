package com.clover.seismicactivitymonitor.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Earthquake extends GeothermalEvent {
    private Double magnitude;
    private Double depth;
}
