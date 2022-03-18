import java.util.Objects;

public class Airport implements AirportInf{
    private String name;

    public Airport(String name) throws Exception {
        if (name == null){
            throw new Exception ("Airport must be non-null");
        }

        if (name.length() != 3) {
            throw new Exception("Airport name must be 3 letters.");
        }
        if (name.charAt(0) < 65 || name.charAt(0) > 90
        || name.charAt(1) < 65 || name.charAt(1) > 90
        || name.charAt(2) < 65 || name.charAt(2) > 90){
            throw new Exception("Airport name must be capitalized.");
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
        Airport airport = (Airport) o;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

