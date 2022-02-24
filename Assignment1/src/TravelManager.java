import Airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;
import flight.CommercialFlight;

public class TravelManager {
    public static void main(String[] args) {
        try {
            Airline Spirit = new Airline("Spirit");
            Airport Chicago = new Airport("ORD");
            Airport LA = new Airport("LAX");
            CommercialFlight SpringBreak = new CommercialFlight(Spirit, Chicago, LA);

            System.out.print(SpringBreak);
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
    }
}
