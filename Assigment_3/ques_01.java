package Assigment_3;

import java.util.Scanner;

public class ques_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        
        if (year < 1582) {
            System.out.println("Year is not valid. Works only for year >= 1582.");
        } else {
            
            
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (checked with multiple if-else).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked with multiple if-else).");
            }

            
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year (checked with logical operators).");
            } else {
                System.out.println(year + " is NOT a Leap Year (checked with logical operators).");
            }
        }

        sc.close();
    }
}

