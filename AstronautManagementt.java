import java.util.Scanner;

public class AstronautManagementt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Astronauts[] astronaut = new Astronauts[10];
        int count = 0;
        int choice;
        do {
            System.out.println("\n Menu");
            System.out.println("1. Create a new Astronaut");
            System.out.println("2. edit a Astronaut");
            System.out.println("3. Remove a Astronaut");
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
