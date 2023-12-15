public class RocketLauncher extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Rocket " + i + " is launching...");
            try {
                Thread.sleep(2000); // Simulate rocket launch time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Notify successful launch
            RocketSuccessNotifier successNotifier = new RocketSuccessNotifier(i);
            successNotifier.start();
        }
    }
}
