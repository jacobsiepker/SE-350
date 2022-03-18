//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Objects;

public class Airline {
    private String name;

    public Airline(String name) throws Exception {
        if (name != null && name.length() < 8 && name.length() != 0) {
            this.name = name;
        } else {
            throw new Exception("Airline name must be less than 8 characters and non-null.");
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Airline airline = (Airline)o;
            return this.name.equals(airline.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}
