import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpaceshipManagement {

    public static Spaceship CreateSpaceship(Scanner input) {
        System.out.println("\n" + " Enter spacecraft name: ");
        String name = input.nextLine();

        System.out.println("Enter the amount of current fuel it has");
        double Currentfuel = input.nextDouble();
        input.nextLine();

        System.out.println("what is the fuel Capacity");
        int fuelCapacity = input.nextInt();
        String filePaths = "Spaceships.CSV";

        // Try-with-resources to handle file writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePaths))) {
            writer.write(new Spaceship(name, Currentfuel, fuelCapacity).toCSV());
            writer.newLine(); // Write each astronaut on a new line
            System.out.println("CSV file created successfully: " + filePaths);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        return new Spaceship(name, Currentfuel, fuelCapacity);
    }

    public static ArrayList<Spaceship> AssignAstronaut(ArrayList<Astronaut> astros, ArrayList<Spaceship> spaceships,
            Scanner input) {
        // Loop through the ships
        // When the ship is selected
        // Loop through the astronauts
        // When the astronaut is selected
        // ships[indexNumberOfSelectedShip].assignedAstronauts.add(astros[indexNumberOfSelectedAstronaut])
        System.out.println("Enter the ship you want to assign to");
        for (int i = 0; i < spaceships.size(); i++) {
            System.out.println(i + ":\t" + spaceships.get(i).GetName());
        }
        int selectedShip = input.nextInt();
        while (selectedShip < 0 || selectedShip > spaceships.size()) {
            System.out.println("Invalid spacecraft selection.");
            selectedShip = input.nextInt();
        }

        System.out.println("Enter the astronaut you want added");
        for (int i = 0; i < astros.size(); i++) {
            System.out.println(i + ":\t" + astros.get(i).name);
        }

        int AstronautSelected = input.nextInt();
        while (selectedShip < 0 || selectedShip > spaceships.size()) {
            System.out.println("Invalid spacecraft selection.");
            selectedShip = input.nextInt();
        }
        System.out.println(AstronautSelected + "has been added to" + selectedShip);
        spaceships.get(selectedShip).assignedAstronauts.add(astros.get(AstronautSelected));
        return spaceships;
    }

    public static ArrayList<Spaceship> LoadFuel(ArrayList<Spaceship> spaceships, Scanner input) {
        System.out.println("what Spaceship do you want to Refill");
        for (int i = 0; i < spaceships.size(); i++) {
            System.out.println(i + ":\t" + spaceships.get(i).GetName());
        }
        int selectedShip = input.nextInt();
        while (selectedShip < 0 || selectedShip > spaceships.size()) {
            System.out.println("Invalid spacecraft selection.");
            selectedShip = input.nextInt();
        }
        System.out.println("how much fuel do you want to refill");
        int fuelAmount = input.nextInt();
        if (fuelAmount <= 0) {
            System.out.println("Invalid amout please enter a positive amount ");
        }
        if (spaceships.get(selectedShip).GetFuel() + fuelAmount > spaceships.get(selectedShip).GetFuelCapacity()) {

            System.out.println(
                    "Fuel loaded to maximum capacity. Current fuel: " + spaceships.get(selectedShip).GetFuelCapacity()
                            + "liters.");
        } else {
            spaceships.get(selectedShip).SetFuel(fuelAmount);
            System.out.println(
                    "Fuel loaded to maximum capacity. Current fuel: " + spaceships.get(selectedShip).GetFuelCapacity()
                            + "liters.");

        }
        return spaceships;
    }
}
