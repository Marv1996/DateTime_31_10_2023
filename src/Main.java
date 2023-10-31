import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Flight flight = new Flight();
        flight.setAirlineName("Condor");
        System.out.println(
                "AirlineName: " + flight.getAirlineName() + " | " +
                        "AirlineDateTime: " + flight.getAirlineDate()
        );
    }
}
