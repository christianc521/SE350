package TravelAssignment.airport;

import TravelAssignment.exception.BadParameterException;
import TravelAssignment.exception.NullParameterException;

import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airport name can not be null.");
        }
        if (name.length() != 3 || !name.equals(name.toUpperCase())) {
            throw new BadParameterException("Invalid TravelAssignment.airport name.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
