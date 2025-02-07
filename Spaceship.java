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

            System.out.printf("Speed: %.2f m/s | Altitude: %.2f m | Fuel left: %.2f liters\n",
                    speed, altitude, currentFuel);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Launch interrupted.");
            }
        }
        System.out.println("Fuel depleted. The spaceship reached an altitude of " + altitude + " meters.");

        if (altitude >= SPACEWALK_ALTITUDE) {
            spacewalk();
        }
    }

    public void returnToEarth() {
        System.out.println("\n Returning to Earth...");

        boolean parachutesDeployed = false;

        while (altitude > 0) {
            speed += GRAVITY;
            altitude -= speed;

            // Burn-up condition

            if (altitude < SPACEWALK_ALTITUDE && speed > 3000) {
                System.out.println("\n 🔥 ALERT! Atmospheric re-entry failure! " + name + " has burned up due to extreme speed!");
                return;
            }

            // Parachute deployment below 10,000 meters
            if (altitude < 10000 && !parachutesDeployed) {
                System.out.println("\n Parachutes deployed! Speed is being reduced for a safe landing.");
                speed = Math.min(speed, 7);
                parachutesDeployed = true;
            }

            if (altitude < 0) {
                altitude = 0;

                System.out.printf("Speed: %.2f m/s | Altitude: %.2f m\n", speed, altitude);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Descent interrupted.");
                    return;
                }
            }
        }
            System.out.println("🚀 " + name + " has safely landed back on Earth!");
        }

// Spacewalk method to start a 30 second timer
public void spacewalk() {
    System.out.println("\n🌌 SPACEWALK INITIATED! 🌌");
    System.out.println("Astronauts are stepping out for a 30-second spacewalk...");

    for (int i = 30; i > 0; i--) {
        System.out.println("🕒 Time remaining: " + i + " seconds...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Spacewalk interrupted.");
            return;
        }
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