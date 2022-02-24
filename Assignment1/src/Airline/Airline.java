package Airline;


import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Objects;

public class Airline {

    public String name;

    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airline name can not be null.");
        }
        if (name.length() > 8) {
            throw new BadParameterException("Invalid airline name.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + getName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
