import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter student fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate discount and discounted fee
        double discount = fee * (discountPercent / 100);
        double discountedFee = fee - discount;

        // Display results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", 
                         discount, discountedFee);

        scanner.close();
    }
}