import java.util.Map;
import java.util.HashMap;

public class AirlineFactory{

    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory(){}

    public static Airline getAirline(String name) {
        return airlineCache.computeIfAbsent(name, newName -> {
            try {
                return new Airline(name);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}