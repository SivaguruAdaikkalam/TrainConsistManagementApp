import java.util.ArrayList;
import java.util.List;

 class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty list for train bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after insertion:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Check if Sleeper bogie exists
        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper bogie exist? " + sleeperExists);

        // Display final list of bogies
        System.out.println("\nFinal state of passenger bogies:");
        System.out.println(passengerBogies);

        // Program ready for next operations
        System.out.println("\nApplication ready for next operations.");
    }
}