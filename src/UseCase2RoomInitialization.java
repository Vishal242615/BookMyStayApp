abstract class Room {
    String type;
    int beds;
    double size;
    double price;


    Room(String type, int beds, double size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    void displayDetails(int availability) {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: $" + price);
        System.out.println("Available Rooms: " + availability);
        System.out.println("-----------------------------------");
    }


}

class SingleRoom extends Room {
    SingleRoom() {
        super("Single Room", 1, 200, 80);
    }
}

class DoubleRoom extends Room {
    DoubleRoom() {
        super("Double Room", 2, 350, 120);
    }
}

class SuiteRoom extends Room {
    SuiteRoom() {
        super("Suite Room", 3, 500, 250);
    }
}

public class UseCase2RoomInitialization {


    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" Book My Stay App ");
        System.out.println(" Hotel Booking System v2.1 ");
        System.out.println("===================================");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        single.displayDetails(singleAvailability);
        doubleRoom.displayDetails(doubleAvailability);
        suite.displayDetails(suiteAvailability);
    }


}
