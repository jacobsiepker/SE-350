import java.util.Date;
import java.util.Objects;

public class Flight {
    private Airline airline;
    private Airport departAirport;
    private Airport arriveAirport;
    private String flightNumber;
    private Date departTime;

    public Flight(Airline airline, Airport departAirport, Airport arriveAirport, Date departTime) {
        this.airline = airline;
        this.departAirport = departAirport;
        this.arriveAirport = arriveAirport;
        this.departTime = departTime;
        this.flightNumber = "" + (Objects.hash(airline, departAirport, arriveAirport, departTime));
        this.flightNumber = this.flightNumber.substring(5);
    }

    public Airline getAirline() {
        return airline;
    }

    public Airport getDepartAirport() {
        return departAirport;
    }

    public Airport getArriveAirport() {
        return arriveAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    @Override
    public String toString() {
        return (airline + " flight # " + flightNumber + "\n\tDeparture Time: " + departTime+
                "\n\tFrom: " +departAirport +"\n\tTo: " + arriveAirport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return airline.equals(flight.airline) && departAirport.equals(flight.departAirport) && arriveAirport.equals(flight.arriveAirport)
                && flightNumber.equals(flight.flightNumber) && departTime.equals(flight.departTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, departAirport, arriveAirport, flightNumber, departTime);
    }
}
