
import java.util.ArrayList;
import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        ArrayList<Astronaut> astronauts = new ArrayList<Astronaut>();
        ArrayList<spaceships> spaceships = new ArrayList<spaceships>();

        do {
            System.out.println("\n Menu");
            System.out.println("1. Astronaut Manager");
            System.out.println("2. Spaceship Manager");
            System.out.println("3. Administation");
            System.out.println("4. Quit");
            System.out.println("\n Enter your choice");
            choice = input.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("\n Menu");
                        System.out.println("1. Create a new Astronaut");
                        System.out.println("2. edit a Astronaut");
                        System.out.println("3. Remove a Astronaut");
                        System.out.println("4. Quit");
                        System.out.print("\n Enter your choice (1-4): ");
                        choice = input.nextInt();
                        if (choice > 4 || choice < 1) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                        input.nextLine();
                        switch (choice) {
                            case 1:
                                astronauts.add(AstronautManagement.createAstronaut(input));
                                break;
                            case 2:
                                astronauts.add(AstronautManagement.editAstronaut(input, astronauts));
                                break;
                            case 3:
                            astronauts.remove(AstronautManagement.removeAstronaut(input, astronauts));
                            break;
                        }
                    } while (choice != 4);
                    break;
                case 2:
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
                        if (choice > 4 || choice < 1) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }

                        // Get user input
                        input.nextLine();
                        switch (choice) {
                            case 1:
                            spaceships.add(Spaceship.CreateSpaceship(input));
                                break;
                            case 2:
                            spaceships.add(Spaceship.AssignAstronaut(astronauts, spaceships, input));
                                break;
                            case 3:
                            spaceships.add(Spaceship.LoadFuel(spaceships, input));
                                break;

                        }
                    } while (choice != 4);
                    break;
                // case 3:
                //     do {
                //         // Display menu options
                //         System.out.println("\n Menu");
                //         System.out.println("1. Launch");
                //         System.out.println("2. remove assinged astronauts");
                //         System.out.println("3. ");
                //         System.out.println("4. Quit");
                //         System.out.print("\n Enter your choice (1-4): ");

                //         // Get user choice
                //         choice = input.nextInt();

                //         // Validate input range
                //         if (choice > 4 || choice < 1) {
                //             System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                //         }
                //         input.nextLine(); // Consume newline
                //         switch (choice) {
                //             case 1:

                //         }
                //         break;
                //     } while (choice != 4);
                //     break;
            }

        } while (choice != 4);

    }
}
