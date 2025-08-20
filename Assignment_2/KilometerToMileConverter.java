import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Calculate the equivalent distance in miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km", miles, km);

        // Close the Scanner object to avoid resource leaks
        input.close();
    }
}