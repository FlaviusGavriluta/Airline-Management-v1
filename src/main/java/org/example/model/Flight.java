package org.example.model;

import org.example.enums.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Flight {
    private final UUID id;
    private Language language;
    private List<Pilot> pilots;
    private List<FlightAttendant> flightAttendants;

    public Flight(Language language) {
        this.id = UUID.randomUUID();
        this.language = language;
        this.pilots = new ArrayList<>();
        this.flightAttendants = new ArrayList<>();
    }

    public boolean isReady() {
        boolean isReady = true;
        Pilot notReadyPilot = pilots.stream()
                .filter(pilot -> !pilot.isReady())
                .findFirst()
                .orElse(null);

        FlightAttendant notReadyAttendant = flightAttendants.stream()
                .filter(flightAttendant -> !flightAttendant.isReady())
                .findFirst()
                .orElse(null);
        if (notReadyPilot != null || notReadyAttendant != null) {
            isReady = false;
            System.out.println("Flight is not ready");
        }
        return isReady;
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public void addAttendant(FlightAttendant flightAttendant) {
        flightAttendants.add(flightAttendant);
    }

    public UUID getId() {
        return id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<FlightAttendant> getFlightAttendants() {
        return flightAttendants;
    }

    public void setFlightAttendants(List<FlightAttendant> flightAttendants) {
        this.flightAttendants = flightAttendants;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", language=" + language +
                ", pilots=" + pilots +
                ", flightAttendants=" + flightAttendants +
                '}';
    }
}