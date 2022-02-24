package flight;

import Airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassangerFlight implements Flight{

    private int passengerCapacity;
    private UUID flightNumber;
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private Date departureTime;

    public PassangerFlight(Airline airline, Airport origine, Airport destination, int passengerCapacity)
            throws NullParameterException, BadParameterException {
        setPassengerCapacity(passengerCapacity);
        setAirline(airline);
        setOrigine(origine);
        setDestination(destination);
        setDepartureTime();

    }

    private void setPassengerCapacity(int passengerCapacity) throws BadParameterException{
        if (passengerCapacity <= 0) {
            throw new BadParameterException("Passenger capacity must be larger than 0.");
        }
        this.passengerCapacity = passengerCapacity;
    }

    private void setAirline(Airline airline) throws NullParameterException {
        if (airline == null) {
            throw new NullParameterException("Airline can not be null.");
        }
        this.airline = airline;
    }

    private void setOrigine(Airport airport) throws NullParameterException {
        if (airport == null) {
            throw new NullParameterException("Origine can not be null.");
        }
        this.origine = origine;
    }

    private void setDestination(Airport airport) throws NullParameterException {
        if (airport == null) {
            throw new NullParameterException("Destination can not be null.");
        }
        this.destination = destination;
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 04, 18, 2, 40);
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getOrigine() {
        return origine.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    @Override
    public String toString() {
        return "{Passenger Flight with capacity " +
                getPassengerCapacity() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity, flightNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;
        PassangerFlight passangerFlight = (PassangerFlight) o;
        return Objects.equals(passengerCapacity, passangerFlight.passengerCapacity) &&
                Objects.equals(flightNumber, passangerFlight.flightNumber);
    }
}
