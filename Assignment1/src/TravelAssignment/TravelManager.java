package TravelAssignment;

import TravelAssignment.Airline.Airline;
import TravelAssignment.Airline.AirlineFactory;
import TravelAssignment.TopFlightManager.ProxyFlightManager;
import TravelAssignment.TopFlightManager.TopFlightManager;
import TravelAssignment.airport.Airport;
import TravelAssignment.airport.AirportFactory;
import TravelAssignment.flight.Flight;

import java.util.Optional;

public class TravelManager {
    public static void main(String[] args) throws Exception {

        Airline Spirit = AirlineFactory.getAirline("Spirit");
        Airline United = AirlineFactory.getAirline("United");
        Airport Chicago = AirportFactory.getAirport("ORD");
        Airport LA = AirportFactory.getAirport("LAX");

        TopFlightManager flightManager = new ProxyFlightManager();

        String SpringBreakFlightNumber = flightManager.createFlight("commercialFlight", Spirit, Chicago, LA, 200);
        String SummerBreakFlightNumber = flightManager.createFlight("passengerFlight", United, Chicago, LA, 250);

        Optional<Flight> SpringBreak = flightManager.getFlightByFlightNumber(SpringBreakFlightNumber);
        Optional<Flight> SummerBreak = flightManager.getFlightByFlightNumber(SummerBreakFlightNumber);

        System.out.print(SpringBreak.get());
        System.out.print(SummerBreak.get());
    }
}

