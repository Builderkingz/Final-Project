import java.util.Scanner;

public class AstronautManagementt {

    // Scanner for user input
    Scanner input = new Scanner(System.in);

        // Array to store astronauts
        Astronauts[] astronaut = new Astronauts[10];

        // Tracking variables
        int count = 0;
        int choice;
        
        //Astronaut attributes for data entry
        String name;
        String date;
        int SerialNum;
        String address;
        String email; 
        double weight;
        String kin;
        String number; 
        double pay;
    public static void main(String[] args) {
    }

    // Method to handle menu and astronaut management
    public void stuff(){
        do {
            // Display menu options
            System.out.println("\n Menu");
            System.out.println("1. Create a new Astronaut");
            System.out.println("2. edit a Astronaut");
            System.out.println("3. Remove a Astronaut");
            System.out.println("4. Quit");
            System.out.print("\n Enter your choice (1-4): ");

            // Get user choice
            choice = input.nextInt();
            if (choice > 4 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:

                // Creating a new astronaut
                
                if (count < astronaut.length) {
                    System.out.println("Enter astronaut name: ");
                    String name = input.nextLine();

                    System.out.println("Enter date (day, month, year): ");
                    String date = input.next();
                    Astronauts gg = new Astronauts (name, date, SerialNum,address, email,weight,kin,number, pay);
                   astronaut[count] = gg;

                    count++;

                    System.out.println(
                            "New astronaut " + gg.name + " has been created.");
                } else {
                    System.out.println(
                            "Maximum astronaut capacity reached.");
                }
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
            }
        } while (choice != 4);
    }
}
