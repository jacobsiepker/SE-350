//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) throws Exception {
        if (name == null) {
            throw new Exception("Airport must be non-null");
        } else if (name.length() != 3) {
            throw new Exception("Airport name must be 3 letters.");
        } else if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z' && name.charAt(1) >= 'A' && name.charAt(1) <= 'Z' && name.charAt(2) >= 'A' && name.charAt(2) <= 'Z') {
            this.name = name;
        } else {
            throw new Exception("Airport name must be capitalized.");
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
            Airport airport = (Airport)o;
            return this.name.equals(airport.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}
