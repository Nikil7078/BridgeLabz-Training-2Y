import java.util.Scanner;

public class DiscountCalculatorWithInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the fee and discount percentage
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage (%): ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount and discounted fee
        double discount = fee * (discountPercent / 100);
        double discountedFee = fee - discount;

        // Display the results
        System.out.printf(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f",
            discount, discountedFee
        );

        // Close the Scanner object to avoid resource leaks
        input.close();
    }
}