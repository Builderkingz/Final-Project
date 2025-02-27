
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class MissionControl {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String pas = "";
        String line = "";
        // Path to your text file
        String filePath = "Pasword.txt"; // Change this to your desired file path

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            try {
                // If file does not exist, create a new one
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File was created: " + filePath);
                    System.out.println("what is your admin pasword");
                    pas = input.nextLine();
                    String pasword = Pasword.encrypt(pas);
                    try (FileWriter writer = new FileWriter(filePath)) {
                        writer.write(pasword); // Writing text to the file
                        System.out.println("Text successfully written to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while writing to the file.");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("File could not be created.");
                }

            } catch (IOException e) {
                // Handle exception if something goes wrong
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + filePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Reading each line from the file
            line = reader.readLine();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        System.out.println("What is the pasword");
        String userpasword = input.nextLine();
        String decryptedPassword = Pasword.decrypt(line);
        if (decryptedPassword.equals(userpasword)) {
            System.out.println("correct pasword");
        } else {
            System.out.println("Worng pasword");
            input.close();
        }

        int choice;
        ArrayList<Astronaut> astronauts = new ArrayList<Astronaut>();
        ArrayList<Spaceship> spaceships = new ArrayList<Spaceship>();
        Launch launch = new Launch(spaceships);
        // Path to the output file
        String filePaths = "astronaut.csv";

        // Try-with-resources to handle file writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePaths))) {
            // Writing Astronauts to file
            writer.write("Name,Date,SerialNum,Address,Email,Weight,Kin,Number,Pay");
            writer.newLine();

            writer.write("Astronauts:\n");
            for (Astronaut astronaut : astronauts) {
                writer.write(astronaut.toCSV().toString());
                writer.newLine(); // Write each astronaut on a new line
            }
            System.out.println("CSV file created successfully: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        do {
            System.out.println("\n Menu");
            System.out.println("1. Astronaut Manager");
            System.out.println("2. Spaceship Manager");
            System.out.println("3. Administation");
            System.out.println("4. Quit");
            System.out.println("\n Enter your choice");
            choice = input.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            input.nextLine();
            switch (choice) {
                case 1:
                    int choiceA;
                    do {
                        System.out.println("\n Menu");
                        System.out.println("1. Create a new Astronaut");
                        System.out.println("2. edit a Astronaut");
                        System.out.println("3. Remove a Astronaut");
                        System.out.println("4. Quit");
                        System.out.print("\n Enter your choice (1-4): ");
                        choiceA = input.nextInt();
                        if (choiceA > 4 || choiceA < 1) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                        input.nextLine();
                        switch (choiceA) {
                            case 1:
                                astronauts.add(AstronautManagement.createAstronaut(input));
                                break;
                            case 2:
                                astronauts.add(AstronautManagement.editAstronaut(input, astronauts));
                                break;
                            case 3:
                                astronauts.remove(AstronautManagement.removeAstronaut(input, astronauts));
                                break;
                        }
                    } while (choiceA != 4);
                    break;
                case 2:
                    int choiceb;

                    do {
                        // Display menu options
                        System.out.println("\n Menu");
                        System.out.println("1. Create a new Spaceship");
                        System.out.println("2. Assign a Astronaut");
                        System.out.println("3. Fuel Spaceship");
                        System.out.println("4. Quit");
                        System.out.print("\n Enter your choice (1-4): ");

                        // Get user input
                        choiceb = input.nextInt();

                        // Validate input range
                        if (choiceb > 4 || choiceb < 1) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }

                        // Get user input
                        input.nextLine();
                        switch (choiceb) {
                            case 1:
                                spaceships.add(SpaceshipManagement.CreateSpaceship(input));
                                break;
                            case 2:
                                spaceships = SpaceshipManagement.AssignAstronaut(astronauts, spaceships, input);
                                break;
                            case 3:
                                spaceships = SpaceshipManagement.LoadFuel(spaceships, input);
                                break;

                        }
                    } while (choiceb != 4);
                    break;
                case 3:
                    int choicec;
                    do {
                        // Display menu options
                        System.out.println("\n Menu");
                        System.out.println("1. Launch");
                        System.out.println("2. Space walk");
                        System.out.println("3. Return to earth");
                        System.out.println("4. Quit");
                        System.out.print("\n Enter your choice (1-4): ");

                        // Get user choice
                        choicec = input.nextInt();

                        // Validate input range
                        if (choicec > 4 || choicec < 1) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                        input.nextLine(); // Consume newline
                        switch (choicec) {
                            case 1:
                                launch.launch(spaceships, input);
                                break;
                            case 2:
                                launch.spacewalk();
                                break;
                            case 3:
                                launch.returnToEarth();
                        }
                        break;
                    } while (choicec != 4);
                    break;
            }

        } while (choice != 4);

    }
}
