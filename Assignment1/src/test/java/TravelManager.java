import java.util.Date;

public class TravelManager {
    public static void main(String[] args) throws Exception {
        Airline airline = new Airline("United");
        Airport airport = new Airport("LAX");
        Airport airport2 = new Airport("ORD");
        Date departure = new Date(2022, 1, 8, 14, 35);
        Flight flight = new Flight(airline, airport, airport2, departure);

        System.out.println(flight);
    }
}