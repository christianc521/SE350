package flight;

import Airline.Airline;
import airport.Airport;
import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;


public class CommercialFlight implements Flight {

    private Airline airline;
    private Airport origine;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origine, Airport destination)
            throws NullParameterException {
        setAirline(airline);
        setOrigine(origine);
        setDestination(destination);
        setDepartureTime();
        setFlightNumber();
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

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 04, 18, 2, 40);
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
        return "Flight{" +
                "airline=" + getAirline() +
                ", origine=" + getOrigine() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origine, destination, flightNumber, departureTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.getClass() != o.getClass()) return false;
        CommercialFlight commercialFlight = (CommercialFlight) o;
        return Objects.equals(airline, commercialFlight.airline) &&
                Objects.equals(origine, commercialFlight.origine) &&
                Objects.equals(destination, commercialFlight.destination) &&
                Objects.equals(flightNumber, commercialFlight.flightNumber) &&
                Objects.equals(departureTime, commercialFlight.departureTime);
    }

}
