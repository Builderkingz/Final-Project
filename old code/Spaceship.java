import java.util.ArrayList;
import java.util.Scanner;

public class Spaceship {
    private String name;
private double fuelCapacity;
private double currentFuel;
private double burnRate;
private double speed;
private double altitude;
private ArrayList<String> astronauts; // Make this an ArrayList<Astronaut>
// START HERE 
// START HERE
// LOOK UP

private static final double GRAVITY = 9.81;
private static final double SPACEWALK_ALTITUDE = 70000;

// Constructor for predefined astronauts

public Spaceship(String name, double fuelCapacity, double currentFuel, ArrayList<String> astronauts) { // Refer to line 11
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = Math.min(currentFuel, fuelCapacity);
    this.speed = 0;
    this.altitude = 0;
    this.astronauts = new ArrayList<>(); // Add Astronauts inside the <>
}

// Constructor with only burn rate

public Spaceship(String name, double fuelCapacity, double burnRate) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = fuelCapacity;
    this.burnRate = burnRate;
    this.speed = 0;
    this.altitude = 0;
    this.astronauts = new ArrayList<>(); // Refer to line 24
}

// Adding an astronaut to the crew

// public void addAstronaut(String astronautName) {
//     Astronauts gg = new Astronauts(astronautName);
//     astronauts.add(gg.getName());
//     System.out.println(astronautName + " has been added to " + name + "'s crew.");
// }

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

public String getName() {
    return name + " liters\nAstronauts: " + astronauts;
}
public double getfuel(){
    return fuelCapacity;
}
public double getCurrentfuel(){
    return currentFuel;
}
public ArrayList<String> getastronauts(){ // Refer to line 11
    return astronauts;
}
}
