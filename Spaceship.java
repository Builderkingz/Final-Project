
import java.util.ArrayList;
import java.util.Scanner;
// world trigger
public class Spaceship {
    String name;
    String fuel;
     static ArrayList<Astronaut> assignedAstronauts = new ArrayList<Astronaut>();
         
             public Spaceship(String name, String fuel) {
                 this.name = name;
                 this.fuel = fuel;
             }
         
             public static Spaceship CreateSpaceship (Scanner input) {
                 System.out.println("\n" + " Enter spacecraft name: ");
                 String name = input.nextLine();
         
                 System.out.println("Enter the amount of fuel it has");
                 String fuel = input.nextLine();
             
                 return new Spaceship(name, fuel);
             }
         public static ArrayList<Spaceship> AssignAstronaut(ArrayList<Astronaut> astros, ArrayList<Spaceship> ships, Scanner input){
               // Loop through the ships
                 // When the ship is selected
                 // Loop through the astronauts
                 // When the astronaut is selected
                 // ships[indexNumberOfSelectedShip].assignedAstronauts.add(astros[indexNumberOfSelectedAstronaut])
                 System.out.println("Enter the ship you want to assign to");
                 for (int i = 0; i < ships.size(); i++) {
                     System.out.println(i + ":\t" + ships.get(i).name);
                 }
                 int selectedShip = input.nextInt();
                 while (selectedShip < 0 || selectedShip > ships.size()) {
                     System.out.println("Invalid spacecraft selection.");
                     selectedShip = input.nextInt();
                 }
         
                 System.out.println("Enter the astronaut you want added");
                 for (int i = 0; i < astros.size(); i++) {
                     System.out.println(i + ":\t" + astros.get(i).name);
                 }
         
                 int AstronautSelected = input.nextInt();
                 while (selectedShip < 0 || selectedShip > ships.size()) {
                     System.out.println("Invalid spacecraft selection.");
                     selectedShip = input.nextInt();
                 }
                 System.out.println(AstronautSelected + "has been added to" + selectedShip);
                 return ships.add(selectedShip).assignedAstronauts.add(astros.get(AstronautSelected));
}
// public static Spaceship LoadFuel(Spaceship ship, Scanner input){
//     System.out.println("what Spaceship do you want to Refill");
//        int fuelAmount = input.nextInt();
//     if (fuelAmount <= 0) {
//         System.out.println("Invalid amout please enter a positive amount ");
//     }
//     if (currentFuel + fuelAmount > fuelCapacity) {
//         currentFuel = fuelCapacity;
//         return "Fuel loaded to maximum capacity. Current fuel: " + currentFuel + " liters.";
//     } else {
//         currentFuel += fuelAmount;
//         return "Fuel successfully loaded. Current fuel: " + currentFuel + " liters.";
//     }
// }
}
