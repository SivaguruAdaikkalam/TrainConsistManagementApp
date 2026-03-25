import java.util.HashMap;
import java.util.Map;

class TrainConsistManagementAppUC6 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC6 ===");

        // Create a HashMap to store bogie name as key and capacity as value
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 36);

        // Display each bogie along with its capacity
        System.out.println("\nBogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nApplication ready for next operations.");
    }
}