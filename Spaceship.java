import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD
=======

>>>>>>> cc3d68ca5e94f03e8903ec79c3500ce600c639a9

public class Spaceship {
public static void main(String[] args) {}

private String name;
private double fuelCapacity;
private double currentFuel;
private double burnRate;
private double speed;
private double altitude;
private ArrayList<String> astronauts;

private static final double GRAVITY = 9.81;
private static final double SPACEWALK_ALTITUDE = 70000;

// Constructor for predefined astronauts

public Spaceship(String name, double fuelCapacity, double currentFuel, ArrayList<String> astronauts) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = Math.min(currentFuel, fuelCapacity);
    this.speed = 0;
    this.altitude = 0;
    this.astronauts = new ArrayList<>();
}

// Constructor with only burn rate

public Spaceship(String name, double fuelCapacity, double burnRate) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = fuelCapacity;
    this.burnRate = burnRate;
    this.speed = 0;
    this.altitude = 0;
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
   

// Getting spaceship details

public String getInfo() {

<<<<<<< HEAD
    return "Spaceship: " + name + "\nFuel Capacity: " + fuelCapacity + " liters\nCurrent Fuel: " + currentFuel + " liters\nAstronauts: " + astronauts;
}

=======
    return "Spaceship: " + name +
    "\nFuel Capacity: " + fuelCapacity + " liters" +
    "\nCurrent Fuel: " + currentFuel + " liters" +
    "\nAstronauts: " + astronauts;
    }
>>>>>>> cc3d68ca5e94f03e8903ec79c3500ce600c639a9
}