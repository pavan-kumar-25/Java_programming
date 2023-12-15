public class RocketSuccessNotifier extends Thread {
    private int rocketNumber;

    public RocketSuccessNotifier(int rocketNumber) {
        this.rocketNumber = rocketNumber;
    }

    public void run() {
        System.out.println("Rocket " + rocketNumber + " launched successfully!");
    }
}
