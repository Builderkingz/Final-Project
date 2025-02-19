import java.util.Scanner;

public class AstronautManagementt {
    Scanner input = new Scanner(System.in);

    // Array to store astronauts, maximum of 10
        Astronauts[] astronaut = new Astronauts[10];
        int count = 0; // Number of astronauts stored
        int choice; // User menu choice
        String name;
        String date;
        int SerialNum;
        String address;
        String email; 
        double weight;
        String kin;
        String number; 
        double pay;
        String status;

    public void stuff(){
        do {
            // Display menu options
            System.out.println("\n Menu");
            System.out.println("1. Create a new Astronaut");
            System.out.println("2. Edit a Astronaut");
            System.out.println("3. Remove a Astronaut");
            System.out.println("4. Quit");
            System.out.print("\n Enter your choice (1-4): ");

            // Get user choice
            choice = input.nextInt();
            if (choice > 4 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine(); // Consume newline character

            switch (choice) {
                // Create a new astronaut
                case 1:
                if (count < astronaut.length) {
                    System.out.println("\n Enter spacecraft name: ");
                    String name = input.nextLine();

                    System.out.println("\n Enter the astronaut's date of birth (Day, month, year): ");
                    String date = input.nextLine();

                    System.out.println("\n Enter the astronaut's serial number: ");
                    int SerialNum = input.nextInt();
                    input.nextLine(); // Consume newline

                    System.out.println("\n Enter the astronaut's address: ");
                    String address = input.nextLine();

                    System.out.println(" \n Enter the astronaut's email: ");
                    String email = input.nextLine();

                    System.out.println("\n" +  " Enter the astronaut's weight: ");
                    double weight = input.nextDouble();
                    input.nextLine(); // Consume newline

                    System.out.println("\n Enter their next of kin: ");
                    String kin = input.nextLine();

                    System.out.println("\n Enter the astronaut's phone number: ");
                    String number = input.nextLine();

                    System.out.println("\n Enter the astronaut's pay: ");
                    int pay = input.nextInt();
                    Astronauts gg = new Astronauts (name, date, SerialNum,address, email,weight,kin,number, pay);
                    astronaut[count] = gg;
                    count++; // Increase astronaut count

                    System.out.println(
                            "New astronaut " + gg.name + " has been created."); 
                } else {
                    System.out.println(
                            "Maximum astronaut capacity reached.");
                }
                    break;

                case 2:
                // Edit astronaut details
                    System.out.println("Which astronaut do you want to edit? ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ":\t" + astronaut[i].getName());
                    }

                    int craftNumber = input.nextInt();
                    while (craftNumber < 0 || craftNumber > count) {
                        System.out.println("Invalid astronaut selection.");
                        craftNumber = input.nextInt();
                    }
                    input.nextLine(); // Consume newline

                    System.out.println("\n Enter new date of birth (Day, Month, Year): ");
                     date = input.nextLine();

                    System.out.println("\n Enter new Serial Number: ");
                     SerialNum = input.nextInt();
                    input.nextLine(); // Consume newline

                    System.out.println("\n Enter new address: ");
                     address = input.nextLine();

                    System.out.println(" \n Enter new email: ");
                     email = input.nextLine();

                    System.out.println("\n Enter new weight: ");
                     weight = input.nextDouble();
                    input.nextLine(); // Consume newline

                    System.out.println("\n Enter new next of kin: ");
                     kin = input.nextLine();

                    System.out.println("\n Enter new phone number: ");
                     number = input.nextLine();

                    System.out.println("\n Enter new pay: ");
                     pay = input.nextInt();
                    System.out.println("Update made");
                    break;

                case 3:
                // Remove an astronaut
                    System.out.println("Which astronaut do you want to remove? ");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ":\t" + astronaut[i].getName());
                    }

                    int RemoveNumber = input.nextInt();
                    while (RemoveNumber < 0 || RemoveNumber > count) {
                        System.out.println("Invalid astronaut selection.");
                        craftNumber = input.nextInt();
                    }
                    break;
            }
        } while (choice != 4); // Loop until user chooses to quit
    }
}
