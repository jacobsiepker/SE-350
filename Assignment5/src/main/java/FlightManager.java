//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public final class FlightManager {
    private ArrayList flightList = new ArrayList();
    private static FlightManager ourInstance;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null) {
            ourInstance = new FlightManager();
        }

        return ourInstance;
    }

    private FlightManager() {
    }

    public void importFlights(){
        ObjectMapper objectMapper = new ObjectMapper();
        //ArrayList flights = new FlightFactory.createFlightFromFile();
        GenericFlight flight = objectMapper.readValue(new File("src/files/resources/"), new TypeReference<List<GenericFlight>>(){});

    }


    public void createFlight() {
        ArrayList<String> airlineList = new ArrayList();
        airlineList.add("United");
        airlineList.add("Delta");
        airlineList.add("Etihad");
        airlineList.add("Spirit");
        Random random = new Random();
        Airline airline = null;

        try {
            airline = new Airline((String)airlineList.get(random.nextInt(airlineList.size())));
        } catch (Exception var18) {
            var18.printStackTrace();
        }

        Airport departure = null;

        try {
            departure = new Airport("ORD");
        } catch (Exception var17) {
            var17.printStackTrace();
        }

        ArrayList<String> arrivalList = new ArrayList();
        arrivalList.add("LAX");
        arrivalList.add("DSM");
        arrivalList.add("JFK");
        arrivalList.add("CUN");
        Airport arrival = null;

        try {
            arrival = new Airport((String)arrivalList.get(random.nextInt(arrivalList.size())));
        } catch (Exception var16) {
            var16.printStackTrace();
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
        } catch (Exception var15) {
            var15.printStackTrace();
        }

        this.flightList.add(flight);
    }

    public CommercialFlight getFlightByNumber(int flightNum) throws Exception {
        for(int i = 0; i < this.flightList.size(); ++i) {
            CommercialFlight cFlight = (CommercialFlight)this.flightList.get(i);
            if (cFlight.getFlightNumber().equals(Integer.toString(flightNum))) {
                return cFlight;
            }
        }

        throw new Exception("Flight number not found.");
    }

    public String toString() {
        String out = "";

        for(int i = 0; i < this.flightList.size(); ++i) {
            CommercialFlight cFlight = (CommercialFlight)this.flightList.get(i);
            out = out + "\n" + cFlight.toString();
        }

        return out;
    }
}
