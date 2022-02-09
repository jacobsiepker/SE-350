import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public final class FlightManager {

    private ArrayList flightList = new ArrayList<CommercialFlight>();

    private static FlightManager ourInstance;
    public static FlightManager getInstance() throws Exception{
        if (ourInstance == null)
            ourInstance = new FlightManager();
        return ourInstance;
    }

    private FlightManager(){
    }

    public void createFlight(){
        //create and add flight to flight list

        //create airlines, arrivals, departures, and randomly pick
        ArrayList<String> airlineList = new ArrayList<String>();
        airlineList.add("United");
        airlineList.add("Delta");
        airlineList.add("Etihad");
        airlineList.add("Spirit");

        //get random airline from list
        Random random = new Random();

        Airline airline = null;
        try {
            airline = new Airline(airlineList.get(random.nextInt(airlineList.size())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Airport departure = null; //this is O'Hares flight system
        try {
            departure = new Airport("ORD");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<String> arrivalList = new ArrayList<String>();
        arrivalList.add("LAX");
        arrivalList.add("DSM");
        arrivalList.add("JFK");
        arrivalList.add("CUN");

        //get random arrival from list
        Airport arrival = null;
        try {
            arrival = new Airport(arrivalList.get(random.nextInt(arrivalList.size())));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        int year = 2022 + random.nextInt(2);
        int month = random.nextInt(12);
        int day = random.nextInt(30);
        int hr = random.nextInt(24);
        int min = random.nextInt(60);

        Date departTime = new Date(year, month, day, hr, min);


        CommercialFlight flight = null;
        try {
            flight = FlightFactory.createFlight("CommercialAirline", airline, departure, arrival, departTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

        flightList.add(flight);
    }

    public CommercialFlight getFlightByNumber(int flightNum) throws Exception {
        //return flight of flight number
        //throw exception if incorrect number
        for (int i = 0; i < this.flightList.size(); i++ ) {
            CommercialFlight cFlight = (CommercialFlight) this.flightList.get(i);
            if (cFlight.getFlightNumber().equals(Integer.toString(flightNum))) {
                return cFlight;
            }
        }
        throw new Exception("Flight number not found.");
    }

    public String toString() {
        String out = "";

        for (int i = 0; i < this.flightList.size(); i++ ){
            CommercialFlight cFlight = (CommercialFlight) this.flightList.get(i);
            out = out + "\n" + cFlight.toString();
        }

        return out;
    }
}
