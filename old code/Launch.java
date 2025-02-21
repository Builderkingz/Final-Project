public class Launch {
    
    // Instance Variables
    private String name;        // Name of the spacecraft
    private double currentFuel;        // Current fuel level
    private double burnRate;        // Rate of fuel consumption
    private double speed;        // Current speed of the spacecraft
    private double altitude;        // Current altitude

    private static final double GRAVITY = 9.81;
    private static final double SPACEWALK_ALTITUDE = 70000;

    // Constructor
    public Launch(String name, double currentFuel, double burnRate) {
        this.name = name;
        this.currentFuel = currentFuel;
        this.burnRate = burnRate;
        this.speed = 0;
        this.altitude = 0;
    }

    // Launch simulation
    public void launch(){
        System.out.println(name + " is launching...");

        while (currentFuel > 0) {
            // Fuel consumption
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
            
            // Displaying current status
            System.out.printf("Speed: %.2f m/s | Altitude: %.2f m | Fuel left: %.2f liters\n",
            speed, altitude, currentFuel);
            
            // Simulate real-time delay
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            System.out.println("Launch interrupted.");
            return;
    }
        }
            // Fuel depletion notice
            System.out.println("Fuel depleted. The spaceship reached an altitude of " + altitude + " meters.");
            
            //Checking if spacewalk is possible
            if (altitude >= SPACEWALK_ALTITUDE) {
                spacewalk();
            }
        }

            // Return to Earth simulation
            public void returnToEarth() {
            System.out.println("\n Returning to Earth...");

            boolean parachutesDeployed = false;

            while (altitude > 0) {

            // Gravy effect during descent

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
            
            // Ensure altitude doesn't go below zero
            if (altitude < 0) {
            altitude = 0;

            // Display descent status
            System.out.printf("Speed: %.2f m/s | Altitude: %.2f m\n", speed, altitude);
            
            // Simulating real-time delay
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            System.out.println("Descent interrupted.");
            return;
        }
    }
}
            // Landing message
            System.out.println("\n🚀 The ship has landed safely. Astronauts may exit.");
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


