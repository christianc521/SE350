package TravelAssignment.TopFlightManager;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.flight.Flight;

import java.util.Optional;

public class RealFlightManager implements TopFlightManager {

    @Override
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        return createFlight(type, airline, origin, destination, passengerCapacity);
    }

    @Override
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return getFlightByFlightNumber(flightNumber);
    }
}
