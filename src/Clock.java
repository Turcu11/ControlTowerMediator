import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Clock extends Thread {
    private int currentTime;

    public Clock() {
        currentTime = 0;
//        startClock();
    }

    @Override
    public void run(){
        startClock();
    }

    private void startClock() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            currentTime++;
            System.out.println("Current Time: " + currentTime);
        }, 0, 1, TimeUnit.SECONDS);  // Run every 1 second

        // For the sake of this example, let the program run for a while
        try {
            Thread.sleep(100000);  // Sleep for 100 seconds
            scheduler.shutdown();  // Stop the scheduler after 100 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCurrentTime() {
        return currentTime;
    }

}
