import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

// Main class
class TrainConsistAppUC8 {
    public static void main(String[] args) {

        // Reusing list from UC7 (sample data)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        // 🔹 Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // Condition
                .collect(Collectors.toList()); // Collect result

        // 🔹 Display original list
        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        // 🔹 Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}