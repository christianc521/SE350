package TravelAssignment.flight;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        try {
            if (type.equals("commercialFlight")) {
                return new CommercialFlight(airline, origin, destination);
            } else if (type.equals("passengerFlight")) {
                return new PassangerFlight(airline, origin, destination, passengerCapacity);
            }

        } catch (NullParameterException e) {
            return null;
        }

        return null;
    }

}
