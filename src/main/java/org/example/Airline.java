package org.example;

import org.example.enums.Language;
import org.example.model.Employee;
import org.example.model.Flight;
import org.example.model.FlightAttendant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airline {
    private List<Flight> flights;
    private List<Employee> employees;

    public Airline() {
        this.flights = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public FlightAttendant findFlightAttendant() {
        return (FlightAttendant) employees.stream()
                .filter(employee -> employee instanceof FlightAttendant)
                .max(Comparator.comparingInt(employee -> ((FlightAttendant) employee).getLanguages().size()))
                .orElse(null);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "flights=" + flights +
                ", employees=" + employees +
                '}';
    }
}