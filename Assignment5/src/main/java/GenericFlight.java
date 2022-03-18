//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Objects;

public class GenericFlight {
    private String type;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String flightNumber;

    public GenericFlight(String airline, String departAirport, String arriveAirport, String departTime) throws Exception {
        if (airline != null && departAirport != null && arriveAirport != null && departTime != null) {
            this.airline = airline;
            this.origin = departAirport;
            this.destination = arriveAirport;
            this.departureTime = departTime;
            //Object[] var10001 = new Object[]{airline, departAirport, arriveAirport, departTime};
            //this.flightNumber = Objects.hash(var10001).makeConcatWithConstants<invokedynamic>(Objects.hash(var10001));
            //this.flightNumber = this.flightNumber.substring(5);
        } else {
            throw new Exception("Flight params must be non-null instances of airline, airport, and date.");
        }
    }

    public String getAirline() {
        return this.airline;
    }

    public String getDepartAirport() {
        return this.origin;
    }

    public String getArriveAirport() {
        return this.destination;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDepartTime() {
        return this.departureTime;
    }

    public void setDepartTime(String departTime) throws Exception {
        if (departTime != null) {
            this.departureTime = departureTime;
        } else {
            throw new Exception("New departure time must be non-null.");
        }
    }

    public String toString() {
        return this.airline + " flight # " + this.flightNumber + "\n\tDeparture Time: " + this.departureTime + "\n\tFrom: " + this.origin + "\n\tTo: " + this.destination;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof GenericFlight)) {
            return false;
        } else {
            GenericFlight flight = (GenericFlight)o;
            return this.airline.equals(flight.airline) && this.origin.equals(flight.origin) && this.destination.equals(flight.destination) && this.flightNumber.equals(flight.flightNumber) && this.departureTime.equals(flight.departureTime);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.airline, this.origin, this.destination, this.flightNumber, this.departureTime});
    }
}
