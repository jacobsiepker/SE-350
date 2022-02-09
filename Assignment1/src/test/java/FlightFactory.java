import java.util.Date;

public class FlightFactory {
    //Factory class
    private FlightFactory(){}

    public static CommercialFlight createFlight(String type, Airline airline, Airport departFrom, Airport arriveAt, Date departTime) throws Exception {

        return new CommercialFlight(airline, departFrom, arriveAt, departTime);
    }
}
