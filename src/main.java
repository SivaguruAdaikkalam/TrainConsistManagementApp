import java.util.LinkedHashSet;
import java.util.Set;

 class TrainConsistManagementAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC5 ===");

        // Initialize LinkedHashSet to maintain insertion order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate, will be ignored

        // Display final train formation
        System.out.println("\nFinal train formation (insertion order preserved, duplicates removed):");
        System.out.println(trainFormation);

        System.out.println("\nApplication ready for next operations.");
    }
}