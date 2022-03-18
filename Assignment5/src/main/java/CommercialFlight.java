//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Objects;

public class CommercialFlight {
    private Airline airline;
    private Airport departAirport;
    private Airport arriveAirport;
    private String flightNumber;
    private Date departTime;

    public CommercialFlight(Airline airline, Airport departAirport, Airport arriveAirport, Date departTime) throws Exception {
        if (airline != null && departAirport != null && arriveAirport != null && departTime != null) {
            this.airline = airline;
            this.departAirport = departAirport;
            this.arriveAirport = arriveAirport;
            this.departTime = departTime;
            //Object[] var10001 = new Object[]{airline, departAirport, arriveAirport, departTime};
            //this.flightNumber = Objects.hash(var10001).makeConcatWithConstants<invokedynamic>(Objects.hash(var10001));
            //this.flightNumber = this.flightNumber.substring(5);
        } else {
            throw new Exception("Flight params must be non-null instances of airline, airport, and date.");
        }
    }

    public Airline getAirline() {
        return this.airline;
    }

    public Airport getDepartAirport() {
        return this.departAirport;
    }

    public Airport getArriveAirport() {
        return this.arriveAirport;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public Date getDepartTime() {
        return this.departTime;
    }

    public void setDepartTime(Date departTime) throws Exception {
        if (departTime != null) {
            this.departTime = departTime;
        } else {
            throw new Exception("New departure time must be non-null.");
        }
    }

    public String toString() {
        return this.airline + " flight # " + this.flightNumber + "\n\tDeparture Time: " + this.departTime + "\n\tFrom: " + this.departAirport + "\n\tTo: " + this.arriveAirport;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof CommercialFlight)) {
            return false;
        } else {
            CommercialFlight flight = (CommercialFlight)o;
            return this.airline.equals(flight.airline) && this.departAirport.equals(flight.departAirport) && this.arriveAirport.equals(flight.arriveAirport) && this.flightNumber.equals(flight.flightNumber) && this.departTime.equals(flight.departTime);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.airline, this.departAirport, this.arriveAirport, this.flightNumber, this.departTime});
    }
}
