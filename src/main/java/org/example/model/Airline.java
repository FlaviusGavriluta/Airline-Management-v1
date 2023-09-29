package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Flight> flights;
    private List<Employee> employees;

    public Airline() {
        this.flights = new ArrayList<>();
        this.employees = new ArrayList<>();
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
