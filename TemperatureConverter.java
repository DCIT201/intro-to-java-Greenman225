import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        // Creating a Scanner object of the Scanner's class for the user input
        Scanner UsrInput = new Scanner(System.in);

        while (true) {
            // Display the menu options to the user
            System.out.println("Welcome to DedSec'sTemperature Converter!");
            System.out.println("You would want an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.println("Enter your choice (1, 2, or 3): ");

            // Reading user input and choice
            int userChoice;
            if (UsrInput.hasNextInt()) { //verifying whether the user's input is an integer
                userChoice = UsrInput.nextInt();
            } else {
                System.out.println("Yooo!, you might want to use an integer, Please choose 1, 2, or 3.");
                UsrInput.next(); // Clear invalid input
                continue; // Prompt user again
            }

            // Handling the selected choice
            switch (userChoice) {
                case 1: // Convert Celsius to Fahrenheit
                    System.out.print("Enter the temperature in Celsius: ");
                    if (UsrInput.hasNextDouble()) { //verifying whether the user's input is double
                        double celsiusTemp = UsrInput.nextDouble();
                        double fahrenheitTemp = (celsiusTemp * 9 / 5) + 32; // Conversion formula
                        char degreeSymbol = '°'; // Degree symbol
                        System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemp + degreeSymbol + "F");
                    } else {
                        System.out.println("Invalid temperature input. Please enter a valid number.");
                        UsrInput.next(); // Clear invalid input
                    }
                    break;

                case 2: // Convert Fahrenheit to Celsius
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    if (UsrInput.hasNextDouble()) { //verifying to check whether user's input is a double
                        double fahrenheitTemp = UsrInput.nextDouble();
                        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9; // Conversion formula
                        char degreeSymbol = '°'; // Degree symbol
                        System.out.println("The temperature in Celsius is: " + celsiusTemp + degreeSymbol + "C");
                    } else {
                        System.out.println("Invalid temperature input. Please enter a valid number.");
                        UsrInput.next(); // Clear invalid input
                    }
                    break;

                case 3: // Exit the program
                    System.out.println("Yooo Amigo, thanks for using the Temperature Converter!, DedSec appreciate,Join US...Let's hack all things");
                    UsrInput.close(); // Close the scanner
                    return; // Exit the program

                default: // handle for invalid choice
                    System.out.println("Awnnn, That's not a valid choice. Please choose 1, 2, or 3.");
            }

            // Add some space for readability
            System.out.println();
        }
    }
}
