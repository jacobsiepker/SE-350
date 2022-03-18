import java.util.Map;
import java.util.HashMap;

public class AirportFactory{

    private static Map<String, Airport> airportCache = new HashMap<>();

    private AirportFactory(){}

    public static Airport getAirport(String name) {
        return airportCache.computeIfAbsent(name, newName -> {
            try {
                Airport airport = new Airport(name);
                return airport;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}