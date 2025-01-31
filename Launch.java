public class Launch {
    
    // Countdown
    public static void main(String[] args) {
        int start = 10;
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        }
        System.out.println("\nLiftoff!");
}
}

