import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class TrainConsistManagementAppUC7 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC7 ===");

        // Create a list to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with name and capacity
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));

        // Display bogies before sorting
        System.out.println("\nBogie capacities (unsorted):");
        for (Bogie bogie : passengerBogies) {
            System.out.println("Bogie: " + bogie.getName() + " | Capacity: " + bogie.getCapacity());
        }

        // Sort bogies by capacity in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Display bogies after sorting
        System.out.println("\nBogie capacities (sorted by capacity, high to low):");
        for (Bogie bogie : passengerBogies) {
            System.out.println("Bogie: " + bogie.getName() + " | Capacity: " + bogie.getCapacity());
        }

        System.out.println("\nApplication ready for next operations.");
    }
}

// Bogie class to store bogie details
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
