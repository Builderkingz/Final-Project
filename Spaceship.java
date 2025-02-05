import java.util.ArrayList;
import java.util.Scanner;


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

// Constructor

public Spaceship(String name, double fuelCapacity, double currentFuel, ArrayList<String> astronauts) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = 0.0;
}

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
   
// Launch simulation

public void launch() {
    System.out.println(name + " is launching...");

    while (currentFuel > 0) {
        
        double fuelBurned = Math.min(burnRate, currentFuel);
        speed += burnRate * 30;
        currentFuel -= fuelBurned;

        // Gravity effect, which reduces speed
        speed -= GRAVITY;
        if (speed < 0) {
        speed = 0;
    }
        // Increasing altitude based on the current speed
        altitude += speed;

        System.out.printf("Speed: %.2f m/s | Altitude: %.2f m | Fuel left: %.2f pounds\n",
        speed, altitude, currentFuel);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Launch interrupted.");
        }
    }
    System.out.println("Fuel depleted. The spaceship reached an altitude of " + altitude + " meters.");
}

// Spacewalk method to start a 30 second timer
private void spacewalk() {
    System.out.println("\\n 🌌 SPACEWALK INITIATED! 🌌");
    System.out.println("Astronauts are stepping out for a 30-second spacewalk...");

    for (int i = 30; i > 0; i--) {
        System.out.println("🕒 Time remaining: \" + i + \" seconds...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Spacewalk interrupted.");
        }
    }
} 

// Getting spaceship details

public String getInfo() {

    return "Spaceship: " + name +
    "\nFuel Capacity: " + fuelCapacity + " liters" +
    "\nCurrent Fuel: " + currentFuel + " liters" +
    "\nAstronauts: " + astronauts;
}
}