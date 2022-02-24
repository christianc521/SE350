package flight;

import Airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class FlightFactory {
        private FlightFactory() {
        }

        private static Map<Airline, Flight> flightCache = new HashMap<>();

        public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
            if (type.equals("commercialFlight")) {
                try {
                    return new CommercialFlight(airline, origin, destination);
                } catch(NullParameterException e) {
                    return null;
                }
            }
            if (type.equals("passengerFlight")) {
                try {
                    Flight newFlight = flightCache.computeIfAbsent(airline, newAirline -> {
                        Airport newOrigin = new Airport();
                        Airport newDestination = new Airport();
                        return new PassangerFlight(newAirline, newOrigin, newDestination, passengerCapacity);
                    });
                    return newFlight;
                } catch(NullParameterException | BadParameterException e) {
                    return null;
                }
            }

            else return null;
        }
}
