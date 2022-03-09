package TravelAssignment.TopFlightManager;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.flight.Flight;

import java.util.Optional;

public interface TopFlightManager {
    String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception;
    Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception;
}
