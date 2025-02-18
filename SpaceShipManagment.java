import java.util.Scanner;

public class SpaceShipManagment {
    Scanner input = new Scanner(System.in);
    Spaceship[] Spaceship = new Spaceship[10];
    int count = 0;
    int choice;
    public void stuff(){
        
        do {
            System.out.println("\n Menu");
            System.out.println("1. Create a new Spaceship");
            System.out.println("2. Assign a Astronaut");
            System.out.println("3. Fuel Spaceship");
            System.out.println("4. Quit");
            System.out.print("\n Enter your choice (1-4): ");
            choice = input.nextInt();
            if (choice > 4 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine();

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
