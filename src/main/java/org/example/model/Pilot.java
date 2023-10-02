package org.example.model;

import org.example.utils.AnalogCompass;

import java.util.Date;

public class Pilot extends Employee {
    private AnalogCompass compass;

    public Pilot(String name, Date birthdate) {
        super(name, birthdate);
        this.compass = null;
    }

    @Override
    public boolean isReady() {
        return hasCompass();
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
                ", compass=" + compass +
                '}';
    }
}