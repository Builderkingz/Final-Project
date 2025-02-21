import java.util.ArrayList;
import java.util.Scanner;

public class SpaceShipManagment {

    // Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Array to store Spaceships (maximum of 10)
    Spaceship[] Spaceship = new Spaceship[10];

    // Counter to track the number of spaceships created
    int count = 0;
    private String name;
private double fuelCapacity;
private double currentFuel;
private ArrayList<String> astronauts; // Make an ArrayList of Astronauts
    // Variable to store the user's menu choice
    int choice;
    Spaceship ship = new Spaceship(name, fuelCapacity, currentFuel, astronauts);
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
                if (count < Spaceship.length) {
                    System.out.println("Enter the name of the Spaceship");
                    name = input.nextLine();

                    System.out.println("enter the amount of fuel itll have");
                    currentFuel = input.nextDouble();
                   
                   Spaceship[count] = ship;

                    count++;

                    System.out.println(
                            "New Spaceship " + name + " has been created."); 
                } else {
                    System.out.println(
                            "Maximum spaceship capacity reached.");
                }
                    break;
                case 2:

                // look back on this code fix it first before the rest- tony 
                System.out.println("Select a space ship to assign a astronaut:");
                for (int i = 0; i < count; i++) {
                    System.out.println(i + ":\t" + Spaceship[i].getName());
                }

                int craftNumber = input.nextInt();
                while (craftNumber < 0 || craftNumber > count) {
                    System.out.println("Invalid spacecraft selection.");
                    craftNumber = input.nextInt();
                }
                System.out.println("what astronaut do you want on this ship");

                for (int i = 0; i < count; i++) { // Use your astronauts arraylist instead of making a new empty one
                    String naem; // Get rid of this
                    Astronauts[] people = new Astronauts[10]; // Dont use this, get rid of it
                    System.out.println(i + ":\t" + people[i].getName()); // Use astronauts arraylist instead of people
                }

                    break;
                case 3:

                    ship.loadFuel(currentFuel);
                    break;
            }
        } while (choice != 4);
    }
}
