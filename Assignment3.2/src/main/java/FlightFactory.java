import java.util.Date;

public class FlightFactory {
    //Factory class
    private FlightFactory(){}

    public static AbstractFlight createFlight(String type, Airline airline, Airport departFrom, Airport arriveAt, Date departTime, String Cargo, int capacity) throws Exception {

        if (type.equals("Commercial")) {
            return new CommercialFlight(airline, departFrom, arriveAt, departTime, Cargo);
        }
        else if (type.equals("Passenger")){
            return new PassengerFlight(airline, departFrom, arriveAt, departTime, capacity);
        }
        else{
            throw new Exception("Flight Type not Recognized");
        }
    }
}
