
import java.util.ArrayList;
import java.util.Scanner;

public class AstronautManagement {
    public static void displayMenu() {
        System.out.println("\n Menu");
        System.out.println("1. Create a new Astronaut");
        System.out.println("2. edit a Astronaut");
        System.out.println("3. Remove a Astronaut");
        System.out.println("4. Quit");
        System.out.print("\n Enter your choice (1-4): ");
    }

    public static Astronaut createAstronaut(Scanner input) {
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
        if (email.endsWith("@gmail.com")) {
            System.out.println("Email accepted.");
        } else {
            System.out.println("Invalid email. Please enter a valid Gmail address.");
        }

        System.out.println("\n" + " Enter their weight");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("\n" + " Enter their next of kin");
        String kin = input.nextLine();

        System.out.println("\n" + "Enter their phone number");
        String number = input.nextLine();

        System.out.println("\n" + "Enter their pay");
        int pay = input.nextInt();
        return new Astronaut(name, date, SerialNum, address, email, weight, kin, number, pay);
    }

    public static Astronaut editAstronaut(Scanner input, ArrayList<Astronaut> astronauts) {
        System.out.println("what astronaut do you want ");
        for (int i = 0; i < astronauts.size(); i++) {
            System.out.println(i + ":\t" + astronauts.get(i).getName());
        }

        int craftNumber = input.nextInt();
        while (craftNumber < 0 || craftNumber > astronauts.size()) {
            System.out.println("Invalid astronaut selection.");
            craftNumber = input.nextInt();
        }

        System.out.println("\n" + " Enter date of birth (day, month, year) ");
        astronauts.get(craftNumber).SetDate(input.nextLine());
        input.nextLine();

        System.out.println("\n" + " Enter the Serial Number");
        astronauts.get(craftNumber).SetSerialNum(input.nextInt());
        input.nextLine();

        System.out.println("\n Enter their address");
        astronauts.get(craftNumber).SetAddress(input.nextLine());

        System.out.println(" \n Enter the email");
        astronauts.get(craftNumber).SetEmail(input.nextLine());

        System.out.println("\n" + " Enter their weight");
        astronauts.get(craftNumber).SetWeight(input.nextDouble());
        input.nextLine();

        System.out.println("\n" + " Enter their next of kin");
        astronauts.get(craftNumber).SetKin(input.nextLine());

        System.out.println("\n" + "Enter their phone number");
        astronauts.get(craftNumber).SetNumber(input.nextLine());

        System.out.println("\n" + "Enter their pay");
        astronauts.get(craftNumber).SetDate(input.nextLine());
        System.out.println("Update made");
        return astronauts.get(craftNumber);
    }

    public static Astronaut removeAstronaut(Scanner input, ArrayList<Astronaut> astronauts) {
        System.out.println("what astronaut do you want ");
        for (int i = 0; i < astronauts.size(); i++) {
            System.out.println(i + ":\t" + astronauts.get(i).getName());
        }

        int RemoveNumber = input.nextInt();
        while (RemoveNumber < 0 || RemoveNumber > astronauts.size()) {
            System.out.println("Invalid spacecraft selection.");
            RemoveNumber = input.nextInt();
        }
        return astronauts.get(RemoveNumber);
    }
}
