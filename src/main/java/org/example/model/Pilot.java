package org.example.model;

import org.example.enums.PilotType;

import java.util.Date;

public class Pilot extends Employee {
    private PilotType pilotType;
    private AnalogCompass compass;

    public Pilot(String name, Date birthdate, PilotType pilotType) {
        super(name, birthdate);
        this.pilotType = pilotType;
        this.compass = null;
    }

    @Override
    public boolean isReady() {
        return hasCompass();
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public void setPilotType(PilotType pilotType) {
        this.pilotType = pilotType;
    }

    public AnalogCompass getCompass() {
        return compass;
    }

    public boolean hasCompass() {
        return compass != null;
    }

    public void setCompass(AnalogCompass compass) {
        this.compass = compass;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "pilotType=" + pilotType +
                ", compass=" + compass +
                '}';
    }
}