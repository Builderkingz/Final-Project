import java.util.Scanner;
public class Administation {

    // Variable to store user menu choice
    int choice;

    // Scanner for user input
    Scanner input = new Scanner(System.in);
    
    private String name;        // Name of the spacecraft
    private double currentFuel;        // Current fuel level
    private double burnRate;        // Rate of fuel consumption
    public void stuff(){
        do {
            // Display menu options
            System.out.println("\n Menu");
            System.out.println("1. Launch");
            System.out.println("2. remove assinged astronauts");
            System.out.println("3. ");
            System.out.println("4. Quit");
            System.out.print("\n Enter your choice (1-4): ");

            // Get user choice
            choice = input.nextInt();

            // Validate input range
            if (choice > 4 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                Launch rocket = new Launch(name, currentFuel, burnRate);
                rocket.launch();
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
            }
        } while (choice != 4);
    }
}
