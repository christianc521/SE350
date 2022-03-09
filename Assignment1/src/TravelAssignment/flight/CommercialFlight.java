package TravelAssignment.flight;

import TravelAssignment.Airline.Airline;
import TravelAssignment.airport.Airport;
import TravelAssignment.exception.NullParameterException;


public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }

}
