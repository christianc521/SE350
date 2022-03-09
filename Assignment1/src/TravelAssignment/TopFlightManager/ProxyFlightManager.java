package TravelAssignment.TopFlightManager;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.FlightManager;
import TravelAssignment.flight.Flight;

import java.util.Optional;

public class ProxyFlightManager implements TopFlightManager{

    private static FlightManager realFlight;

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception {

        System.out.println("A flight is being created.");
        if (realFlight == null) {
            realFlight = FlightManager.getInstance();
        }
        return realFlight.createFlight(type, airline, origin, destination, passengerCapacity);
    }


    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception {

        System.out.println("Flight number: " + flightNumber + " is being retrieved.");
        if (realFlight == null) {
            realFlight = FlightManager.getInstance();
        }
        return realFlight.getFlightByFlightNumber(flightNumber);
    }

}
