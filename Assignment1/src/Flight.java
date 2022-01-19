import java.security.InvalidParameterException;
import java.util.Date;
import java.util.UUID;

public class Flight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public Flight (Airline air, Airport ori, Airport dest, String flightNumber, Date departureTime)
        throws InvalidParameterException {
        setAirline(air);
        setOrigineAirport(ori);
        setDestinationAirport(dest);
        setFlightNumber(flightNumber);
        setDate(departureTime);
    }
    public void setAirline(Airline line) {
        airline = line;
    }
    public void setOrigineAirport(Airport airport) {
        origine = airport;
    }
    public void setDestinationAirport(Airport airport) {
        destination = airport;
    }

    public void setDate(Date deparTime) {
        if (!(departureTime instanceof Date)) {
            throw new InvalidParameterException("Date is not a valid time.");
        }
        departureTime = deparTime;
    }

    public void setFlightNumber(String flightNum) {
        flightNumber = flightNum;
    }

    public Airport getOrigineAirport () {
        return origine;
    }

}
