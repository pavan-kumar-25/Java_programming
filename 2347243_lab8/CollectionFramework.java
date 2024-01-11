import java.util.*;

// Implementing the domain Aerospace
class Aerospace {
    String name;
    String country;

    public Aerospace(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Country: " + country;
    }
}

public class CollectionFramework {

    public static void main(String[] args) {
        // Creating Aerospace objects
        Aerospace boeing = new Aerospace("Boeing", "USA");
        Aerospace airbus = new Aerospace("Airbus", "EU");
        Aerospace spaceX = new Aerospace("SpaceX", "USA");

        // 1. Implementing List collection
        List<Aerospace> list = new ArrayList<>();
        list.add(boeing);
        list.add(airbus);
        list.add(spaceX);

        System.out.println("List Collection:");
        for (Aerospace aerospace : list) {
            System.out.println(aerospace);
        }

        // 2. Implementing Set collection
        Set<Aerospace> set = new HashSet<>();
        set.add(boeing);
        set.add(airbus);
        set.add(spaceX);

        System.out.println("\nSet Collection:");
        for (Aerospace aerospace : set) {
            System.out.println(aerospace);
        }

        // 3. Implementing Map collection
        Map<String, Aerospace> map = new HashMap<>();
        map.put(boeing.name, boeing);
        map.put(airbus.name, airbus);
        map.put(spaceX.name, spaceX);

        System.out.println("\nMap Collection:");
        for (Map.Entry<String, Aerospace> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}