import java.util.Scanner;

public class AstronautManagementt {
    Scanner input = new Scanner(System.in);
        Astronauts[] astronaut = new Astronauts[10];
        int count = 0;
        int choice;
        String name;
        String date;
        int SerialNum;
        String address;
        String email; 
        double weight;
        String kin;
        String number; 
        double pay;

    public void stuff(){
        do {
            System.out.println("\n Menu");
            System.out.println("1. Create a new Astronaut");
            System.out.println("2. Edit a Astronaut");
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
                if (count < astronaut.length) {
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
