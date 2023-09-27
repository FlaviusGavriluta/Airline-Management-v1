package org.example.model;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date birthdate;

    public Employee(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    abstract boolean isReady();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
