
// world trigger

import java.util.ArrayList;

public class Spaceship {
    String name;
    double currentFuel;
    int fuelCapacity;

    ArrayList<Astronaut> assignedAstronauts = new ArrayList<Astronaut>();

    public Spaceship(String name, double currentFuel, int fuelCapacity) {
        this.name = name;
        this.currentFuel = currentFuel;
        this.fuelCapacity = fuelCapacity;
    }

    public String GetName() {
        return name;
    }

    public double GetFuel() {
        return currentFuel;
    }

    public int GetFuelCapacity() {
        return fuelCapacity;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetFuel(double fuel) {
        this.currentFuel = fuel;
    }

    public void SetFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String toCSV() {
       return name + "," + currentFuel + "," + fuelCapacity;
    }
}
