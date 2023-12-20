package Logical_Program;

public class StopwatchProgram {
    private long startTime;
    private long endTime;
    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");
    }
    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
        long elapsedTime = endTime - startTime;
        formatTime(elapsedTime);
    }
    private void formatTime(long milliseconds) {
        long seconds = (milliseconds / 1000) % 60;
        long minutes = (milliseconds / (1000 * 60)) % 60;
        long hours = (milliseconds / (1000 * 60 * 60)) % 24;
        System.out.println("Elapsed Time: " + hours+":"+minutes+":"+seconds);
    }

    public static void main(String[] args) {
        StopwatchProgram stopwatch = new StopwatchProgram();
        stopwatch.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();
    }
}
