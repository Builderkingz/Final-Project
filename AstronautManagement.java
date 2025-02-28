
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        System.out.println("\n" + " Enter Astronaut name: ");
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
        // Check if the email ends with "@gmail.com" and continue asking if it is
        // invalid
        while (!email.endsWith("@gmail.com")) {
            System.out.println("Invalid email. Please enter a valid Gmail address.");
            email = input.nextLine(); // Get the email again if invalid
        }

        System.out.println("Email accepted.");

        System.out.println("\n" + " Enter their weight");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("\n" + " Enter their next of kin");
        String kin = input.nextLine();

        System.out.println("\n" + "Enter their phone number");
        String number = input.nextLine();

        System.out.println("\n" + "Enter their pay");
        int pay = input.nextInt();
        // Path to the output file
        String filePaths = "Astronaut.csv";

        // Try-with-resources to handle file writing
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePaths, true))) {
            // Append the new astronaut data to the file
        writer.append(new Astronaut(name, date, SerialNum, address, email, weight, kin, number, pay).toCSV() + "\n");
        
        System.out.println("CSV file updated successfully: " + filePaths);
    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file.");
        e.printStackTrace();
    }
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
        Astronaut astronautToEdit = astronauts.get(craftNumber);

        // Proceed to edit details of the astronaut
        System.out.println("\nEnter date of birth (day, month, year):");
        astronautToEdit.SetDate(input.nextLine());
        input.nextLine();

        System.out.println("\nEnter the Serial Number:");
        astronautToEdit.SetSerialNum(input.nextInt());
        input.nextLine(); // Consume the newline character

        System.out.println("\nEnter their address:");
        astronautToEdit.SetAddress(input.nextLine());

        System.out.println("\nEnter the email:");
        astronautToEdit.SetEmail(input.nextLine());

        System.out.println("\nEnter their weight:");
        astronautToEdit.SetWeight(input.nextDouble());
        input.nextLine(); // Consume the newline character

        System.out.println("\nEnter their next of kin:");
        astronautToEdit.SetKin(input.nextLine());

        System.out.println("\nEnter their phone number:");
        astronautToEdit.SetNumber(input.nextLine());

        System.out.println("\nEnter their pay:");
        astronautToEdit.SetPay(input.nextInt());

        System.out.println("Astronaut updated successfully.");

        // After editing, write the updated list back to CSV
        writeAstronautsCSV(astronauts);

        return astronautToEdit;
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

        astronauts.remove(RemoveNumber);
        System.out.println("Astronaut deleted successfully.");

        // After deleting, write the updated list back to CSV
        writeAstronautsCSV(astronauts);
        return astronauts.get(RemoveNumber);
    }

    public static void writeAstronautsCSV(ArrayList<Astronaut> astronauts) {
        String filePath = "Astronaut.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Astronaut astronaut : astronauts) {
                writer.write(astronaut.toCSV() + "\n"); // Assuming toCSV() returns a CSV-friendly string
                writer.newLine();
            }
            System.out.println("CSV file updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
