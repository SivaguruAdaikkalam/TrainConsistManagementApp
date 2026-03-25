import java.util.HashSet;
import java.util.Set;

class TrainConsistManagementAppUC3 {
    public static void main(String[] args) {
        Set<String> bogieIDs = new HashSet<>();

        // Add duplicate bogie IDs
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG103");

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs: " + bogieIDs);
    }
}