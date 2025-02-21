

import java.util.ArrayList;

public class Spaceship {
    String name;
    ArrayList<Astronaut> assignedAstronauts = new ArrayList<Astronaut>();
    
    public Spaceship(String name, String dob) {
        this.name = name;
    }

    public static ArrayList<Spaceship> displayAddAstroMenu(ArrayList<Astronaut> astros, ArrayList<Spaceship> ships) {
        // Loop through the ships
            // When the ship is selected
            // Loop through the astronauts
                // When the astronaut is selected
                    // ships[indexNumberOfSelectedShip].assignedAstronauts.add(astros[indexNumberOfSelectedAstronaut])
        return ships;
    }

    
}
