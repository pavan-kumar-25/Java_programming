public class AerospaceMultithreading {
    public static void main(String[] args) {
        RocketLauncher rocketLauncher = new RocketLauncher();
        FlightMonitor flightMonitor = new FlightMonitor();

        // Start both threads
        rocketLauncher.start();
        flightMonitor.start();

        // Wait for both threads to finish
        try {
            rocketLauncher.join();
            flightMonitor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Aerospace tasks completed.");
    }
}
