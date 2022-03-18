import java.util.Date;

public class PassengerFlight extends AbstractFlight{
    private int passengerCapacity;
    //commercial flight specific code

    public PassengerFlight(Airline airline, Airport departAirport, Airport arriveAirport, Date departTime, int passengerCapacityI) throws Exception {
        super(airline, departAirport, arriveAirport, departTime);

        if (passengerCapacityI == 0){
            throw new Exception("Capacity must be non-zero");
        }
        passengerCapacity = passengerCapacityI;
    }

    public int getCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return (airline + " passenger flight # " + flightNumber + "\n\tDeparture Time: " + departTime+
                "\n\tFrom: " +departAirport +"\n\tTo: " + arriveAirport + "\n\tCapacity: " + passengerCapacity);
    }
}