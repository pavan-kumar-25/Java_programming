import java.util.ArrayList;
import java.util.List;

interface AerospaceComponent<T> {
    void add(T component);
    T getComponent(int index);
}

class Spacecraft<T extends AerospaceComponent<?>> implements AerospaceComponent<T> {

    private List<T> components = new ArrayList<>();

    @Override
    public void add(T component) {
        components.add(component);
    }

    @Override
    public T getComponent(int index) {
        return components.get(index);
    }

    public List<T> getComponents() {
        return components;
    }
}

interface RocketFuel {}

class LiquidFuel implements RocketFuel {

    public void ignite() {
        System.out.println("Liquid fuel ignited");
    }
}

class Engine<T extends RocketFuel> implements AerospaceComponent<T> {

    private T fuel;

    public void setFuel(T fuel) {
        this.fuel = fuel;
    }

    @Override
    public void add(T component) {
        this.fuel = component;
    }

    @Override
    public T getComponent(int index) {
        return fuel;
    }

    public T getFuel() {
        return fuel;
    }
}

public class AerospaceGenerics {

    public static void main(String[] args) {

        Spacecraft<Engine<LiquidFuel>> spaceship = new Spacecraft<>();

        spaceship.add(createEngine());
        spaceship.add(createEngine());

        System.out.println("Spaceship engines: " + spaceship.getComponents().size());

        for (Engine<LiquidFuel> engine : spaceship.getComponents()) {
            engine.getFuel().ignite();
        }
    }

    private static Engine<LiquidFuel> createEngine() {
        Engine<LiquidFuel> engine = new Engine<>();
        engine.setFuel(new LiquidFuel());
        return engine;
    }
}