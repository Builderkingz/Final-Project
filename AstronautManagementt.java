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
<<<<<<< HEAD

=======
    public static void main(String[] args) {
    }

    // Method to handle menu and astronaut management
>>>>>>> ab578b1b6a7f2ec446dab25cd1a51efa7e5dab70
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
<<<<<<< HEAD
                    System.out.println("\n" + " Enter spacecraft name: ");
                    String name = input.nextLine();

                    System.out.println("\n" + " Enter date of birth (day, month, year) ");
                    String date = input.nextLine();

                    System.out.println("\n" + " Enter the Serial Number");
                    int SerialNum = input.nextInt();
                    input.nextLine();

                    System.out.println("\n Enter their address");
                    String address = input.nextLine();

                    System.out.println(" \n Enter the email");
                    String email = input.nextLine();

                    System.out.println("\n" +  " Enter their weight");
                    double weight = input.nextDouble();
                    input.nextLine();

                    System.out.println("\n" + " Enter their next of kin");
                    String kin = input.nextLine();

                    System.out.println("\n" + "Enter their phone number");
                    String number = input.nextLine();

                    System.out.println("\n" + "Enter their pay");
                    int pay = input.nextInt();
=======
                    System.out.println("Enter astronaut name: ");
                    String name = input.nextLine();

                    System.out.println("Enter date (day, month, year): ");
                    String date = input.next();
>>>>>>> ab578b1b6a7f2ec446dab25cd1a51efa7e5dab70
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
                    System.out.println("what astronaut do you want ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ":\t" + astronaut[i].getName());
                    }

                    int craftNumber = input.nextInt();
                    while (craftNumber < 0 || craftNumber > count) {
                        System.out.println("Invalid spacecraft selection.");
                        craftNumber = input.nextInt();
                    }

                    System.out.println("\n" + " Enter date of birth (day, month, year) ");
                     date = input.nextLine();

                    System.out.println("\n" + " Enter the Serial Number");
                     SerialNum = input.nextInt();
                    input.nextLine();

                    System.out.println("\n Enter their address");
                     address = input.nextLine();

                    System.out.println(" \n Enter the email");
                     email = input.nextLine();

                    System.out.println("\n" +  " Enter their weight");
                     weight = input.nextDouble();
                    input.nextLine();

                    System.out.println("\n" + " Enter their next of kin");
                     kin = input.nextLine();

                    System.out.println("\n" + "Enter their phone number");
                     number = input.nextLine();

                    System.out.println("\n" + "Enter their pay");
                     pay = input.nextInt();
                    System.out.println("Update made");
                    break;
                case 3:
                    System.out.println("what astronaut do you want ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ":\t" + astronaut[i].getName());
                    }

                    int RemoveNumber = input.nextInt();
                    while (RemoveNumber < 0 || RemoveNumber > count) {
                        System.out.println("Invalid spacecraft selection.");
                        craftNumber = input.nextInt();
                    }
                    break;
            }
        } while (choice != 4);
    }
}
