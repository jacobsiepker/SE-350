//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class TravelManager {
    public TravelManager() {
    }

    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 5; ++i) {
            FlightManager.getInstance().createFlight();
        }

        System.out.println(FlightManager.getInstance());
        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Search by Flight Number: ");
        String number = input.nextLine();
        System.out.println(FlightManager.getInstance().getFlightByNumber(Integer.parseInt(number)));
    }
}
