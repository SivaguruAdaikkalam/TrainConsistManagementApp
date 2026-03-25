import java.util.LinkedList;

 class TrainConsistManagementAppUC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App - UC4 ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order: Engine → Passenger → Cargo → Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nTrain consist after initial additions:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index starts at 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        System.out.println("\nFinal ordered train consist ready for operations.");
    }
}