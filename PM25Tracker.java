import java.util.Random;

public class PM25Tracker {
    public static void main(String[] args) {
        // Using while loop
        System.out.println("Tracking with while loop:");
        int day = 1;
        Random rand = new Random();
        while (day <= 30) {
            int pm25 = rand.nextInt(300) + 1; // Random value 1-300
            System.out.println("Day " + day + ": PM2.5 = " + pm25);
            day++;
        }
        
        // Using for loop
        System.out.println("\nTracking with for loop:");
        for (int i = 1; i <= 30; i++) {
            int pm25 = rand.nextInt(300) + 1;
            System.out.println("Day " + i + ": PM2.5 = " + pm25);
        }
    }
}