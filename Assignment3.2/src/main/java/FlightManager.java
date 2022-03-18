import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public final class FlightManager {

    private ArrayList<AbstractFlight> flightList = new ArrayList<AbstractFlight>();

    private static FlightManager ourInstance;
    public static FlightManager getInstance() throws Exception{
        if (ourInstance == null)
            ourInstance = new FlightManager();
        return ourInstance;
    }

    private FlightManager(){
    }

    public void createFlight(String type){
        //create and add flight to flight list

        //create airlines, arrivals, departures, and randomly pick
        ArrayList<String> airlineList = new ArrayList<String>();

        if (type == "Passenger") {
            airlineList.add("United");
            airlineList.add("Delta");
            airlineList.add("Etihad");
            airlineList.add("Spirit");
        }
        else if (type == "Commercial") {
            airlineList.add("FedEx");
            airlineList.add("USPS");
            airlineList.add("Amazon");
            airlineList.add("DHL");
        }

        //get random airline from list
        Random random = new Random();

        String airlineName = airlineList.get(random.nextInt(airlineList.size()));

        Airline airline = AirlineFactory.getAirline(airlineName);

        Airport departure = AirportFactory.getAirport("ORD"); //this is O'Hares flight system

        ArrayList<String> arrivalList = new ArrayList<String>();
        arrivalList.add("LAX");
        arrivalList.add("DSM");
        arrivalList.add("JFK");
        arrivalList.add("CUN");

        //get random arrival from list
        String arrivalName = arrivalList.get(random.nextInt(arrivalList.size()));
        Airport arrival = AirportFactory.getAirport(arrivalName);

        int year = 2022 + random.nextInt(2);
        int month = random.nextInt(12);
        int day = random.nextInt(30);
        int hr = random.nextInt(24);
        int min = random.nextInt(60);

        Date departTime = new Date(year, month, day, hr, min);

        String cargo = "";
        if (type.equals("Commercial")) {
            ArrayList<String> cargoList = new ArrayList<>();
            cargoList.add("Military Supplies");
            cargoList.add("US Mail");
            cargoList.add("Consumables");
            cargoList.add("Shrubberies");

            cargo = cargoList.get(random.nextInt(cargoList.size()));
        }

        int capacity = 0;
        if (type.equals("Passenger")){
            capacity = random.nextInt(300);
            if (capacity < 20){capacity = 20;}
        }

        AbstractFlight flight = null;
        try {
            flight = FlightFactory.createFlight(type, airline, departure, arrival, departTime, cargo, capacity);
        } catch (Exception e) {
            e.printStackTrace();
        }

        flightList.add(flight);
    }

    public AbstractFlight getFlightByNumber(int flightNum) throws Exception {
        //return flight of flight number
        //throw exception if incorrect number
        for (int i = 0; i < this.flightList.size(); i++ ) {
            AbstractFlight cFlight = (AbstractFlight) this.flightList.get(i);
            if (cFlight.getFlightNumber().equals(Integer.toString(flightNum))) {
                return cFlight;
            }
        }
        throw new Exception("Flight number not found.");
    }

    public String toString() {
        String out = "";

        for (int i = 0; i < this.flightList.size(); i++ ){
            AbstractFlight cFlight = (AbstractFlight) this.flightList.get(i);
            out = out + "\n" + cFlight.toString();
        }

        return out;
    }
}
