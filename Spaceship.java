import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 0922be977c786fdc005ac3edea7cf8c0dda6a617

public class Spaceship {
public static void main(String[] args) {}

private String name;
private double fuelCapacity;
private double currentFuel;
private double burnRate;
private double speed;

private ArrayList<String> astronauts;

// Constructor

public Spaceship(String name, double fuelCapacity, double currentFuel, ArrayList<String> astronauts) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = 0.0;}
public Spaceship(String name, double fuelCapacity, double burnRate) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = fuelCapacity;
    this.burnRate = burnRate;
    this.speed = 0;

    this.astronauts = new ArrayList<>();
}

// Adding an astronaut to the crew

public void addAstronaut(String astronautName) {
    astronauts.add(astronautName);
    System.out.println(astronautName + " has been added to " + name + "'s crew.");
}

// Refuel / Load fuel method

public String loadFuel(double fuelAmount) {
    if (fuelAmount <= 0) {
        return "Invalid fuel amount. Please enter a positive value.";
}
if (currentFuel + fuelAmount > fuelCapacity) {
    currentFuel = fuelCapacity;
    return "Fuel loaded to maximum capacity. Current fuel: " + currentFuel + " liters.";
} else {
    currentFuel += fuelAmount;
    return "Fuel successfully loaded. Current fuel: " + currentFuel + " liters.";
}
} 
    


    
// Launch method

public void launch() {
    System.out.println(name + " is launching...");

    while (currentFuel > 0) {
        
        double fuelBurned = Math.min(burnRate, currentFuel);
        speed += burnRate * 30;
        currentFuel -= fuelBurned;

        System.out.println("Speed: " + speed + " m/s | Fuel left: " + currentFuel + " pounds");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Launch interrupted.");
        }
    }
    System.out.println("Fuel depleted. Speed: " + speed + " m/s. The spaceship is now drifting in space.");
}


// Getting spaceship details

public String getInfo() {

    return "Spaceship: " + name + "\nFuel Capacity: " + fuelCapacity + " liters\nCurrent Fuel: " + currentFuel + " liters\nAstronauts: " + astronauts;
    return "Spaceship: " + name +
    "\nFuel Capacity: " + fuelCapacity + " pounds" +
    "\nCurrent Fuel: " + currentFuel + " pounds" +
    "\nBurn Rate: " + burnRate + " pounds/sec" +
    "\nSpeed: " + speed + " m/s" +
    "\nAstronauts: " + astronauts;
}

}