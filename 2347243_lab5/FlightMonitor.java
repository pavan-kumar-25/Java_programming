public class FlightMonitor extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Flight " + i + " is being monitored.");
            try {
                Thread.sleep(1500); // Simulate flight monitoring time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
