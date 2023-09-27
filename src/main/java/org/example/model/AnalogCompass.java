package org.example.model;

import java.util.UUID;

public class AnalogCompass {
    private final UUID id;

    public AnalogCompass() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AnalogCompass{" +
                "id=" + id +
                '}';
    }
}
