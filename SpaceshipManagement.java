import java.util.ArrayList;
import java.util.Scanner;

public class SpaceshipManagement {

    static ArrayList<Astronaut> assignedAstronauts = new ArrayList<Astronaut>();

    public static Spaceship CreateSpaceship(Scanner input) {
        System.out.println("\n" + " Enter spacecraft name: ");
        String name = input.nextLine();

        System.out.println("Enter the amount of current fuel it has");
        int Currentfuel = input.nextInt();
        input.nextLine();

        System.out.println("what is the fuel Capacity");
        int fuelCapacity = input.nextInt();

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
        return spaceships.add(selectedShip).assignedAstronauts.add(astros.get(AstronautSelected));
    }
}


//     public static Spaceship LoadFuel(ArrayList<spaceships> spaceships, Scanner input) {
//     System.out.println("what Spaceship do you want to Refill");
//     for (int i = 0; i < spaceships.size(); i++) {
//         System.out.println(i + ":\t" + spaceships.get(i).getName());
//     }
//     int selectedShip = input.nextInt();
//     while (selectedShip < 0 || selectedShip > spaceships.size()) {
//         System.out.println("Invalid spacecraft selection.");
//         selectedShip = input.nextInt();
//     }
//     System.out.println("how much fuel do you want to refill");
//     int fuelAmount = input.nextInt();
//     if (fuelAmount <= 0) {
//     System.out.println("Invalid amout please enter a positive amount ");
//     }
//     if (spaceships.get(selectedShip).getfuel() + fuelAmount > spaceships.get(selectedShip).GetFuelCapacity()) {
//         spaceships.get(selectedShip).getfuel() = spaceships.get(selectedShip).GetFuelCapacity();
//     return "Fuel loaded to maximum capacity. Current fuel: " + currentFuel + "liters.";
//     } else {
//     currentFuel += fuelAmount;
//     return "Fuel successfully loaded. Current fuel: " + currentFuel + " liters.";
//     }
//     }
// }
