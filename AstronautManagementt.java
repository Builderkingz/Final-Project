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
    public static void main(String[] args) {
    }
    public void stuff(){
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
                if (count < astronaut.length) {
<<<<<<< HEAD
                    System.out.println("Enter astronaut name: ");
                    String name = input.nextLine();

                    System.out.println("Enter date (day, month, year): ");
                    String date = input.next();
=======
                    System.out.println("\n" + " Enter spacecraft name: ");
                    String name = input.nextLine();

                    System.out.println("\n" + " Enter date of birth (day, month, year) ");
                    String date = input.nextLine();

                    System.out.println("\n" + " Enter the Serial Number");
                    int SerialNum = input.nextInt();

                    System.out.println("\n Enter their address");
                    String address = input.nextLine();

                    System.out.println(" \n Enter the email");
                    String email = input.nextLine();

                    System.out.println("\n" +  " Enter their weight");
                    double weight = input.nextDouble();

                    System.out.println("\n" + " Enter their next of kin");
                    String kin = input.nextLine();

                    System.out.println("\n" + "Enter their phone number");
                    String number = input.nextLine();

                    System.out.println("\n" + "Enter their pay");
                    int pay = input.nextInt();
>>>>>>> dff66edc9d82de5098e151562b6b833ed83daa14
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
