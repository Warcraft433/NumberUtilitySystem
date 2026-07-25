package com.numberutility.service;

import java.util.Scanner;

public class NumberUtilityService {

	public static void primeNumber(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println(num + " is not a Prime Number");
			return;
		}

		boolean isPrime = true;

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}

	public static void armstrongNumber(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negative numbers are not Armstrong Numbers");
			return;
		}

		int originalNum = num;
		int digitCount = String.valueOf(num).length();
		int sum = 0;

		for (int i = num; i > 0; i /= 10) {

			int digit = i % 10;
			int power = 1;

			for (int j = 1; j <= digitCount; j++) {
				power *= digit;
			}

			sum += power;
		}

		if (originalNum == sum) {
			System.out.println(originalNum + " is an Armstrong Number");
		} else {
			System.out.println(originalNum + " is not an Armstrong Number");
		}
	}

	public static void palindromeNumber(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println(num + " is not a Palindrome Number.");
			return;
		}

		int originalNum = num;
		int reverseNumber = 0;

		for (int i = num; i > 0; i /= 10) {
			reverseNumber = reverseNumber * 10 + i % 10;
		}

		if (originalNum == reverseNumber) {
			System.out.println(originalNum + " is a Palindrome Number.");
		} else {
			System.out.println(originalNum + " is not a Palindrome Number.");
		}
	}

	public static void strongNumber(Scanner sc) {

		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		if (num < 0) {
			System.out.println("Negative numbers are not Strong Numbers");
			return;
		}

		for (int i = num; i > 0; i /= 10) {
			long fact = 1;
			for (int j = 1; j <= i % 10; j++) {
				fact *= j;
			}
			sum += fact;
		}
		if (num == sum) {
			System.out.println(num + " is a Strong Number");
		} else {
			System.out.println(num + " is not a Strong Number");
		}

	}

	public static void perfectNumber(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("Please enter a positive number.");
			return;
		}

		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (num == sum) {
			System.out.println(num + " is a Perfect Number.");
		} else {
			System.out.println(num + " is not a Perfect Number.");
		}
	}

	public static void reverseNumber(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negative numbers are not allowed.");
			return;
		}

		int originalNum = num;
		int reverseNumber = 0;

		for (int i = num; i > 0; i /= 10) {
			reverseNumber = reverseNumber * 10 + i % 10;
		}

		System.out.println("Reverse of " + originalNum + " is " + reverseNumber);
	}

	public static void fibonacciSeries(Scanner sc) {

		System.out.print("Enter number of terms: ");
		int terms = sc.nextInt();

		if (terms <= 0) {
			System.out.println("Please enter a positive number.");
			return;
		}

		int first = 0;
		int second = 1;

		System.out.print("Fibonacci Series: ");

		for (int i = 0; i < terms; i++) {

			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}

		System.out.println();
	}

	public static void factorial(Scanner sc) {

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			return;
		}

		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + num + " is " + factorial);
	}

	public static void calculator(Scanner sc) {

	    int choice;

	    do {

	        System.out.println("\n========== CALCULATOR ==========");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.println("5. Modulus");
	        System.out.println("0. Back to Main Menu");

	        System.out.print("\nEnter your choice: ");
	        choice = sc.nextInt();

	        if (choice == 0) {
	            System.out.println("Returning to Main Menu...");
	            break;
	        }

	        if (choice < 1 || choice > 5) {
	            System.out.println("Invalid Choice");
	            continue;
	        }

	        System.out.print("Enter First Number: ");
	        double firstNumber = sc.nextDouble();

	        System.out.print("Enter Second Number: ");
	        double secondNumber = sc.nextDouble();

	        switch (choice) {

	        case 1:
	            System.out.println("Result = " + (firstNumber + secondNumber));
	            break;

	        case 2:
	            System.out.println("Result = " + (firstNumber - secondNumber));
	            break;

	        case 3:
	            System.out.println("Result = " + (firstNumber * secondNumber));
	            break;

	        case 4:

	            if (secondNumber == 0) {
	                System.out.println("Cannot divide by zero.");
	            } else {
	                System.out.println("Result = " + (firstNumber / secondNumber));
	            }

	            break;

	        case 5:

	            if (secondNumber == 0) {
	                System.out.println("Cannot perform modulus by zero.");
	            } else {
	                System.out.println("Result = " + (firstNumber % secondNumber));
	            }

	            break;
	        }

	    } while (true);
	}
}