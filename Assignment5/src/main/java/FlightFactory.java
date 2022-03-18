//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlightFactory {
    private FlightFactory() {
    }

    public static CommercialFlight createFlight(String type, Airline airline, Airport departFrom, Airport arriveAt, Date departTime) throws Exception {
        return new CommercialFlight(airline, departFrom, arriveAt, departTime);
    }

    public static GenericFlight createFlightFromFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<GenericFlight> flights = objectMapper.readValue(new File("src/files/json_flights.json"), GenericFlight.class);


    }
}
