public class DebugTrip {

    public static void main(String[] args) {
        System.out.println("Trip 1");
        TestTrip trip1 = new TestTrip("New York");
        System.out.println("Destination: " + trip1.getDestination());
        System.out.println("Departure: " + trip1.getDepartureCity());
        System.out.println("Mode: " + trip1.getMode());

        System.out.println("\nTrip 2");
        TestTrip trip2 = new TestTrip("Dallas", "Chicago");
        System.out.println("Destination: " + trip2.getDestination());
        System.out.println("Departure: " + trip2.getDepartureCity());
        System.out.println("Mode: " + trip2.getMode());

        System.out.println("\nTrip 3");
        TestTrip trip3 = new TestTrip("Paris", "London", "plane");
        System.out.println("Destination: " + trip3.getDestination());
        System.out.println("Departure: " + trip3.getDepartureCity());
        System.out.println("Mode: " + trip3.getMode());
    }
}

class TestTrip {

    private String destination;
    private String departure;
    private String mode;
    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    public TestTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    public TestTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    public TestTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
}