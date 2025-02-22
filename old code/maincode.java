import java.util.ArrayList;
import java.util.Scanner;


public class maincode {
     
    public static void main(String[] args) throws Exception {
        // // When the program runs. Check if there is a passwords.txt file
        // // If passwords.txt exists, ask the user for the password.
        // // Encrypt the password they give and compare hashes OR decrypt the stored password and compare strings
        // // If the passwords.txt does not exist, ask the user to enter a password
        // // Encrypt this password and store it in passwords.txt
        // if(pasword.firstTimeCheck()) {
        //     // First time
        //     // Ask for password
        //     // Save it
        // } else {
        //     // Check credentials
        // }
        // String pas = "abc123";
        // pasword.encrypt(pas);
        // pasword.decrypt(null);
        SecretKey key = Pasword.generateKey();
        String pas = null;
        Pasword.encrypt(pas,key);
        Pasword.decrypt(null,key);
        Scanner input = new Scanner(System.in);
        ArrayList<Astronaut> astronauts = new ArrayList<Astronaut>();
        ArrayList<spaceshipasdfgass> spaceships = new ArrayList<spaceshipasdfgass>();
  
        int choice;
        do{
            // ask them there choice in the menu 
            System.out.println("\n Menu");
            System.out.println("1. Astronaut Manager");
            System.out.println("2. Spaceship Manager");
            System.out.println("3. Administation");
            System.out.println("4. Quit");
            System.out.println("\n Enter your choice");
            choice = input.nextInt();
            if (choice > 5 || choice < 1){
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
            input.nextLine();
            switch (choice) {
                case 1:
                    // call the astronaut mannager class and set it up1
                AstronautManagementt Astronaut = new AstronautManagementt();
                Astronaut.stuff();
                
                break;
                case 2:
                    // call the rocet manager class and set that up
                spaceshipsmanagement Spaceship = new spaceshipsmanagement();
                Spaceship.stuff();

                break;

                case 3:
                    // call the administration and set that up
                Administation Admin = new Administation();
                Admin.stuff();


                break;

            }
        }while (choice != 4);
    input.close();

    }
}
