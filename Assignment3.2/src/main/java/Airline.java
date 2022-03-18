import java.util.Objects;

public class Airline implements AirlineInf{
    private String name;

    public Airline(String name) throws Exception {
        if (name == null || name.length() >= 8 || name.length() == 0) {
            throw new Exception("Airline name must be less than 8 characters and non-null.");
        }
        else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return name.equals(airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
