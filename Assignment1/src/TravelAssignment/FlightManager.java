package TravelAssignment;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.flight.Flight;
import TravelAssignment.flight.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManager {

    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}

