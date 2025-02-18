import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            // Display menu options
            System.out.println("\n Menu");
            System.out.println("1. Astronaut Manager");
            System.out.println("2. Rocket Manager");
            System.out.println("3. Administation");
            System.out.println("4. Quit");
            System.out.println("\n Enter your choice");
            choice = input.nextInt();
            if (choice > 5 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            input.nextLine();
            switch (choice) {
                case 1:
<<<<<<< HEAD
                    // call the astronaut mannager class and set it up1
=======
                    // Call the Astronaut Management class and execute its menu
>>>>>>> ab578b1b6a7f2ec446dab25cd1a51efa7e5dab70
                AstronautManagementt Astronaut = new AstronautManagementt();
                Astronaut.stuff();
                
                break;
                case 2:
                    // Call the Rocket Management class and execute its menu
                SpaceShipManagment Spaceship = new SpaceShipManagment();
                Spaceship.stuff();

                break;

                case 3:
                    // Call the Administration class and execute its menu
                Administation Admin = new Administation();
                Admin.stuff();


                break;

            }
        }while (choice != 4);
    
        // Close scanner to prevent resource leaks
        input.close();
    }
}
