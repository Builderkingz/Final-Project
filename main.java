import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            // ask them there choice in the menu 
            System.out.println("\n Menu");
            System.out.println("1. Astronaut Manager");
            System.out.println("2. Rocket Manager");
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
                    // call the astronaut mannager class and set it up
                
                
                break;
                case 2:
                    // call the rocet manager class and set that up
                

                break;

                case 3:
                    // call the administration and set that up


                break;

            }
        }while (choice != 4);
    

    }
}
