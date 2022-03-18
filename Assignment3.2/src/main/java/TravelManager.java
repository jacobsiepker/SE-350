import java.util.Date;
import java.util.Scanner;

public class TravelManager {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 5; i++){
            String type = "Commercial";
            if (i%2==0){
                type = "Passenger";
            }
            FlightManager.getInstance().createFlight(type);
        }
        System.out.println(FlightManager.getInstance());
        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Search by Flight Number: ");
        String number = input.nextLine();
        System.out.println(FlightManager.getInstance().getFlightByNumber( Integer.parseInt(number) ));
    }
}