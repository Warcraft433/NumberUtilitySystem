package com.numberutility.app;

import java.util.Scanner;
import com.numberutility.service.*;

public class NumberUtilityApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== NUMBER UTILITY SYSTEM ==========");
            System.out.println("1. Prime Number");
            System.out.println("2. Armstrong Number");
            System.out.println("3. Palindrome Number");
            System.out.println("4. Strong Number");
            System.out.println("5. Perfect Number");
            System.out.println("6. Reverse Number");
            System.out.println("7. Fibonacci Series");
            System.out.println("8. Factorial");
            System.out.println("9. Calculator");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                NumberUtilityService.primeNumber(sc);
                break;

            case 2:
                NumberUtilityService.armstrongNumber(sc);
                break;

            case 3:
                NumberUtilityService.palindromeNumber(sc);
                break;

            case 4:
                NumberUtilityService.strongNumber(sc);
                break;

            case 5:
                NumberUtilityService.perfectNumber(sc);
                break;

            case 6:
                NumberUtilityService.reverseNumber(sc);
                break;

            case 7:
                NumberUtilityService.fibonacciSeries(sc);
                break;

            case 8:
                NumberUtilityService.factorial(sc);
                break;

            case 9:
                NumberUtilityService.calculator(sc);
                break;

            case 0:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}