import java.util.ArrayList;
import java.util.Scanner;

public class Spaceship {
public static void main(String[] args) {}

private String name;
private double fuelCapacity;
private double currentFuel;
private ArrayList<String> astronauts;

// Constructor

public Spaceship(String name, double fuelCapacity, double currentFuel, ArrayList<String> astronauts) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = 0.0;
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
    return "Spaceship: " + name + "\nFuel Capacity: " + fuelCapacity + " liters\nCurrent Fuel: " + currentFuel + " liters\nAstronauts: " + astronauts;
}

}