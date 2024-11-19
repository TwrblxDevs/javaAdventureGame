package functions;

public class consoleFunctions {
    public static void loadingBar(int totalSteps, int delay) {
        try {
            System.out.print("["); // Start of the loading bar
            for (int i = 0; i < totalSteps; i++) {
                System.out.print("#"); // Add a hash for each step
                Thread.sleep(delay); // Pause for the specified delay
            }
            System.out.println("]"); // End of the loading bar
        } catch (InterruptedException e) {
            System.err.println("Error: Loading interrupted.");
        }
    }
}
