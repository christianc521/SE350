package TravelAssignment.flight;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.exception.NullParameterException;
import TravelAssignment.exception.BadParameterException;

import java.util.Objects;

public class PassangerFlight extends Flight{

    private int passengerCapacity;


    public PassangerFlight(Airline airline, Airport origine, Airport destination, int passengerCapacity)
            throws NullParameterException {
        super(airline,origine,destination);
    }

    private void setPassengerCapacity(int passengerCapacity) throws BadParameterException{
        if (passengerCapacity <= 0) {
            throw new BadParameterException("Passenger capacity must be larger than 0.");
        }
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "{Passenger Flight with capacity " +
                passengerCapacity +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassangerFlight that = (PassangerFlight) o;
        return passengerCapacity == that.passengerCapacity;
    }
}
