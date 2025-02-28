import java.util.ArrayList;
import java.util.Scanner;

public class Launch {

    // Instance Variables
    private double burnRate = 12; // Rate of fuel consumption
    private double speed; // Current speed of the spacecraft
    private double altitude; // Current altitude
    private ArrayList<Spaceship> spaceship;

    private static final double GRAVITY = 9.81;
    private static final double SPACEWALK_ALTITUDE = 70000;

    public Launch(ArrayList<Spaceship> ship) {
        this.spaceship = ship;
    }

    // Launch simulation
    public String launch(ArrayList<Spaceship> spaceships, Scanner input) {
        System.out.println("Select the ship you want to launch: ");
        for (int i = 0; i < spaceships.size(); i++) {
            System.out.println(i + ":\t" + spaceships.get(i).GetName());
        }
        int selectedShip = input.nextInt();
        while (selectedShip < 0 || selectedShip > spaceships.size()) {
            System.out.println("Invalid spacecraft selection.");
            selectedShip = input.nextInt();
        }
        System.out.println(spaceship.get(selectedShip).GetName() + " is launching...");

        while (spaceship.get(selectedShip).GetFuel() > 0) {
            // Fuel consumption
            double fuelBurned = Math.min(burnRate, spaceship.get(selectedShip).GetFuel());
            speed += burnRate * 30;
            spaceship.get(selectedShip).SetFuel(spaceship.get(selectedShip).GetFuel() - fuelBurned);

            // Gravity effect, which reduces speed

            speed -= GRAVITY;
            if (speed < 0) {
                speed = 0;
            }

            // Increasing altitude based on the current speed

            altitude += speed;

            // Displaying current status
            System.out.printf("Speed: %.2f m/s | Altitude: %.2f m | Fuel left: %.2f liters\n",
                    speed, altitude, spaceship.get(selectedShip).GetFuel());
                
            

            // Simulate real-time delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return "Launch interrupted.";
            }
        }
        // Fuel depletion notice
        if (altitude >= SPACEWALK_ALTITUDE) {
            spacewalk();
        }
        returnToEarth();
        return "Fuel depleted. The spaceship reached an altitude of " + altitude + " meters.";

        // Checking if spacewalk is possible

    }

    // Return to Earth simulation
    public String returnToEarth() {
        System.out.println("\n Returning to Earth...");

        boolean parachutesDeployed = false;

        while (altitude > 0) {

            // Gravy effect during descent

            speed += GRAVITY;
            altitude -= speed;

            // Burn-up condition

            if (altitude < SPACEWALK_ALTITUDE && speed > 3000) {
                return "\n 🔥 ALERT! Atmospheric re-entry failure! burned up due to extreme speed!";
            }

            // Parachute deployment below 10,000 meters
            if (altitude < 10000 && !parachutesDeployed) {
                System.out.println("\n Parachutes deployed! Speed is being reduced for a safe landing.");
                speed = Math.min(speed, 7);
                parachutesDeployed = true;

            }

            // Ensure altitude doesn't go below zero
            if (altitude < 0) {
                altitude = 0;

                // Display descent status
                System.out.printf("Speed: %.2f m/s | Altitude: %.2f m\n", speed, altitude);

                // Simulating real-time delay
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return "Descent interrupted.";
                }
            }
        }
        // Landing message
        return "\n🚀 The ship has landed safely. Astronauts may exit.";
    }

    // 🌌 Spacewalk simulation
    public void spacewalk() {
        System.out.println("\n🌌 SPACEWALK INITIATED! 🌌");
        System.out.println("Astronauts are stepping out for a 30-second spacewalk...");

        // Countdown for spacewalk duration
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
}
