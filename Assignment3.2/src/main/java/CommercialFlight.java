import java.util.Date;
import java.util.Objects;

public class CommercialFlight extends AbstractFlight{
    //commercial flight specific code
    private String cargo;
    //commercial flight specific code

    public CommercialFlight(Airline airline, Airport departAirport, Airport arriveAirport, Date departTime, String cargoI) throws Exception {
        super(airline, departAirport, arriveAirport, departTime);
        cargo = cargoI;
    }

    @Override
    public String toString() {
        return (airline + " commercial flight # " + flightNumber + "\n\tDeparture Time: " + departTime+
                "\n\tFrom: " +departAirport +"\n\tTo: " + arriveAirport + "\n\tCargo: " + cargo);
    }


}
