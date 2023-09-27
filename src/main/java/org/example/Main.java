package org.example;

import org.example.enums.Language;
import org.example.enums.PilotType;
import org.example.model.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pilot pilot1 = new Pilot("pilot1", new Date(1987, 12, 04), PilotType.CAPTAIN);
        Pilot pilot2 = new Pilot("pilot2", new Date(1957, 02, 14), PilotType.CO_PILOT);

        AnalogCompass c1 = new AnalogCompass();
        AnalogCompass c2 = new AnalogCompass();
        pilot1.setCompass(c1);
        pilot2.setCompass(c2);
        System.out.println(pilot1);

        FlightAttendant fa1 = new FlightAttendant("fa1", new Date(1963, 03, 07), Arrays.asList(Language.ENGLISH, Language.RUSSIAN));
        FlightAttendant fa2 = new FlightAttendant("fa2", new Date(1943, 03, 03), Arrays.asList(Language.ENGLISH, Language.GERMAN));
        FlightAttendant fa3 = new FlightAttendant("fa3", new Date(1965, 03, 07), Arrays.asList(Language.ENGLISH, Language.SPANISH));

        Flight flight = new Flight(Language.ENGLISH);

        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addAttendant(fa1);
        flight.addAttendant(fa2);
        flight.addAttendant(fa3);
        flight.isReady();

        Airline airline = new Airline();
    }
}