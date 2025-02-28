
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

        String astroPath = "Astronaut.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(astroPath))) {
            String astroLine;
            // astroLine = reader.readLine();
            while ((astroLine = reader.readLine()) != null) {
                // Split line by comma
                String[] data = astroLine.split(",");
                // Ensure that the line has exactly 9 values (matching the columns in the CSV)
                if (data.length == 9) {
                    // Parse data from the CSV file and create a new Astronaut object
                    String name = data[0];
                    String date = data[1];
                    int serialNum = Integer.parseInt(data[2]);
                    String address = data[3];
                    String email = data[4];
                    double weight = Double.parseDouble(data[5]);
                    String kin = data[6];
                    String number = data[7];
                    int pay = Integer.parseInt(data[8]);

                    // Create a new Astronaut object and add it to the ArrayList
                    Astronaut astronaut = new Astronaut(name, date, serialNum, address, email, weight, kin, number,
                            pay);
                    astronauts.add(astronaut);
                    // appendAstronautToCSV(astronaut);

                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        String SpacePath = "Spaceships.CSV";
        try (BufferedReader reader = new BufferedReader(new FileReader(SpacePath))) {
            String SpaceLine;
            SpaceLine = reader.readLine();
            while ((line = reader.readLine()) != null) {
                // Split line by comma
                String[] data = SpaceLine.split(",");
                // Ensure that the line has exactly 9 values (matching the columns in the CSV)
                if (data.length == 3) {
                    // Parse data from the CSV file and create a new Astronaut object
                    String name = data[0];
                    double currentFuel = Double.parseDouble(data[1]);
                    int fuelCapacity = Integer.parseInt(data[2]);

                    // Create a new Astronaut object and add it to the ArrayList
                    Spaceship spaceship = new Spaceship(name, currentFuel, fuelCapacity);
                    spaceships.add(spaceship);
                    // appendSpaceshipToCSV(spaceship);

                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
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



    public static void appendAstronautToCSV(Astronaut astronaut) {
    String filePath = "Astronaut.csv";

    // Open the file in append mode
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {  // 'true' means append mode
        writer.write(astronaut.toCSV());  // Assuming toCSV() formats the astronaut data as CSV
        writer.newLine();  // Ensure each astronaut is on a new line
        System.out.println("Astronaut added to CSV.");
    } catch (IOException e) {
        System.out.println("An error occurred while appending to the file.");
        e.printStackTrace();
    }
}
public static void appendSpaceshipToCSV(Spaceship spaceship) {
    String filePath = "Spaceships.CSV";

    // Open the file in append mode
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {  // 'true' means append mode
        writer.write(spaceship.toCSV());  // Assuming toCSV() formats the spaceship data as CSV
        writer.newLine();  // Ensure each spaceship is on a new line
        System.out.println("Spaceship added to CSV.");
    } catch (IOException e) {
        System.out.println("An error occurred while appending to the file.");
        e.printStackTrace();
    }
}
}
