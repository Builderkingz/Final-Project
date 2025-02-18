import java.util.Scanner;

public class SpaceShipManagment {

    // Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Array to store Spaceships (maximum of 10)
    Spaceship[] Spaceship = new Spaceship[10];

    // Counter to track the number of spaceships created
    int count = 0;

    // Variable to store the user's menu choice
    int choice;

    // Method to handle the spaceship management menu
    public void stuff(){
        
        do {
            // Display menu options
            System.out.println("\n Menu");
            System.out.println("1. Create a new Spaceship");
            System.out.println("2. Assign a Astronaut");
            System.out.println("3. Fuel Spaceship");
            System.out.println("4. Quit");
            System.out.print("\n Enter your choice (1-4): ");

            // Get user input
            choice = input.nextInt();

            // Validate input range
            if (choice > 4 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

            // Get user input
            input.nextLine();

            // Handle user selection

            switch (choice) {

                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
            }
        } while (choice != 4);
    }
}
