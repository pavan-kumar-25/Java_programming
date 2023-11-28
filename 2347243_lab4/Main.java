import aerospace.Airplane;
import aerospace.Helicopter;
import aerospace.FlyingObject;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Airplane and Helicopter
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        // Using the FlyingObject interface methods
        System.out.println("=== Airplane ===");
        useFlyingObject(airplane);

        System.out.println("\n=== Helicopter ===");
        useFlyingObject(helicopter);
    }

    // Method to demonstrate the use of FlyingObject interface
    private static void useFlyingObject(FlyingObject flyingObject) {
        flyingObject.takeOff();
        flyingObject.fly();
        flyingObject.land();
    }
}