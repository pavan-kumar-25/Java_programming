package aerospace;

// Concrete class representing an airplane
public class Airplane implements FlyingObject {
    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing");
    }
}