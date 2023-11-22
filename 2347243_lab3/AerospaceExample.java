// Aerospace base class 
abstract class SpaceComponent {

    abstract void describe();
    
    final String type = "Component";
    
}

// Concrete subclass 
class RocketEngine extends SpaceComponent {

    @Override
    void describe() {
        System.out.println("I am a " + super.type); 
        System.out.println("I generate thrust to propel rockets\n");
    }

}

// Final class 
final class FuelTank {
    
    private double capacity;
    
    public double getCapacity() {
        return capacity;
    }

}

// Abstract subclass
abstract class Spaceship {
    
    abstract void launch();
    
    abstract void land();
    
}

// Concrete subclass
class Shuttle extends Spaceship {

    @Override
    void launch() {
        System.out.println("Main engines ignited. Solid rocket boosters ignited");
    }

    @Override
    void land() { 
        System.out.println("Landing gear engaged. Touching down on runway.");
    }

}

public class AerospaceExample {

    public static void main(String[] args) {
        
        Shuttle shuttle = new Shuttle();
        shuttle.launch();
        shuttle.land();
        
        RocketEngine engine = new RocketEngine();
        engine.describe();
        
    }

}