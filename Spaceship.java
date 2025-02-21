
// world trigger
public class Spaceship {
    String name;
    int currentFuel;
    int fuelCapacity;

    public Spaceship(String name, int currentFuel, int fuelCapacity) {
        this.name = name;
        this.currentFuel = currentFuel;
        this.fuelCapacity = fuelCapacity;
    }

    public String GetName() {
        return name;
    }

    public int GetFuel() {
        return currentFuel;
    }
    public int GetFuelCapacity(){
        return fuelCapacity;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetFuel(int fuel){
        this.currentFuel = fuel;
    }
    public void SetFuelCapacity(int fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
}
