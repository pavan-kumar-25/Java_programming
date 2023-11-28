package aerospace;

// Concrete class representing a helicopter
public class Helicopter implements FlyingObject {
    @Override
    public void takeOff() {
        System.out.println("Helicopter is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing");
    }
}