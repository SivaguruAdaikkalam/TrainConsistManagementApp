import java.util.ArrayList;
import java.util.List;

 class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty dynamic list to hold bogies
        List<String> trainConsist = new ArrayList<>();

        // Display the initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Indicate program is ready for further use cases
        System.out.println("Application ready for next operations.");
    }
}