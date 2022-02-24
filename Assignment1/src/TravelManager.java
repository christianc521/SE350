import Airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;
import flight.CommercialFlight;
import flight.PassangerFlight;

public class TravelManager {
    public static void main(String[] args) {
        try {
            Airline Spirit = new Airline("Spirit");
            Airline United = new Airline("United");
            Airport Chicago = new Airport("ORD");
            Airport LA = new Airport("LAX");
            CommercialFlight SpringBreak = new CommercialFlight(Spirit, Chicago, LA);
            PassangerFlight SummerBreak = new PassangerFlight(United, Chicago, LA, 20);

            System.out.print(SpringBreak);
            System.out.print(SummerBreak);
        } catch (NullParameterException e) {
            e.printStackTrace();
        } catch (BadParameterException e) {
            e.printStackTrace();
        }
    }
}
