import java.security.InvalidParameterException;
import java.util.Date;
import java.util.UUID;

public class TravelManager {
    public static void main(String[] args) throws InvalidParameterException {
        Airline airline1 = new Airline("United");
        Airport airport1 = new Airport("ORD");
        Airport airport2 = new Airport("LAX");
        Date day = new Date(2022, 03, 18, 2,5, 0);
        UUID num = UUID.randomUUID();
        Flight vacation = new Flight(airline1, airport1, airport2, num.toString(), day);

        System.out.println(vacation.getOrigineAirport().toString());
    }
}
