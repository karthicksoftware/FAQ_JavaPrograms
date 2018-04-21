package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class AllPrograms {

	// Print prime numbers?
	@Test(enabled = false)
	public void printPrimeNumbers() {
		//Prime numbers below 100
		int flag = 0;
		System.out.println(1);
		for(int i=2; i<100; i++){
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					flag++;
				}
			}
			if(flag == 2)
				System.out.println(i);
			flag = 0; // Its important to reset flag value to zero at any cost.
		}

	}
	
	// Basic Java program to find area and perimeter of circle
	@Test(enabled = false)
	public void perimeterOfCircle() {
		double pi = Math.PI;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Radius of the Circle : ");
		int radius = in.nextInt();
		System.out.println("Perimeter or Circumference of the Circle is : "+ (2*pi*radius));
	}
	
	// Print 1 to 10 without using loops
	int i = 1;
	@Test(enabled = false)
	public void printWithoutLoops() {
		if(i <= 10){
			System.out.println(i);
			i++;
			printWithoutLoops();
		}		
	}
	
	// Print numbers in pyramid shape?
	@Test(enabled = false)
	public void printPyramidShape() {
		
	}
	
	// Add 2 Matrices
	@Test(enabled = false)
	public void addTwoMatrices() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Rows : ");
		int numberOfRows = input.nextInt();
		System.out.print("Enter number of Columns : ");
		int numberOfCols = input.nextInt();
		int firstMatrix[][] = new int[numberOfRows][numberOfCols];
		int secondMatrix[][] = new int[numberOfRows][numberOfCols];
		int sumMatrix[][] = new int[numberOfRows][numberOfCols];
		System.out.println("Enter the values in first matrix:");
		for(int row = 0; row < numberOfRows; row++){
			for(int col = 0; col < numberOfCols; col++){
				firstMatrix[row][col] = input.nextInt();
			}
		}
		System.out.println("Enter the values in second matrix:");
		for(int row = 0; row < numberOfRows; row++){
			for(int col = 0; col < numberOfCols; col++){
				secondMatrix[row][col] = input.nextInt();
			}
		}
		System.out.println("Sum of two matrices are:");
		for(int row = 0; row < numberOfRows; row++){
			for(int col = 0; col < numberOfCols; col++){
				sumMatrix[row][col] = (firstMatrix[row][col] + secondMatrix[row][col]);
				System.out.print(sumMatrix[row][col] + " ");
			}
			System.out.println();
		}
		input.close();
	}
	
	// Basic Java Example Program to check even or add
	@Test(enabled = false)
	public void isOddOrEven() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = input.nextInt();
		if(num % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
	
	// What happens if we place return statement in try catch blocks
		/*
		 * If we have return statement in try, then return statement should be called at the end of the method as well,
		 * Or else compile time error should be displayed.
		 * If we have return statement in try and catch, then no need to specify another one return statement at the end of the method.
		 * If we have return statement before any line inside method, then unreachable code warning should be shown.
		 * */
	
	// Write a java program to convert binary to decimal
	@Test(enabled = false)
	public void convertBinaryToDecimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter binary numbers:");
		int value = input.nextInt();
		int rem = 0;
		int result = 0;
		int power = 0;
		while( value != 0 ){
			rem = value % 10;
			result = (int) (result + (rem * (Math.pow(2, power))));
			System.out.println(result);
			power++;
			value = value / 10;
		}
		input.close();
	}
	
	// Java Program to convert Decimal to Binary
	@Test(enabled = false)
	public void convertDecimalToBinary() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number:");
		int value = input.nextInt();
		List<Integer> result = new ArrayList<Integer>();
		while(value != 0){
			result.add(value%2);
			value = value / 2;
		}
		Collections.reverse(result);
		result.forEach(System.out::print);
		System.out.println();
		input.close();
	}
	
	// Interfaces allows constructors?
	/* No. */
	
	// Can we create private constructor in java
	/*Yes, it is to restrict objects to be created outside the class*/
	
	// Java interview Questions on main() method
	/**
	 * Main method should be static because it will be accessed without object reference.
	 * Main method should be declared public, because it should be visible to every members in the package.
	 * Main method can't return any types, thus it should be void always
	 * Main method should be given with param of array type to driver data from command line.
	 */
	
	// Explain java data types with example programs
	
	// Swap two numbers without using third variable in java
	@Test(enabled = false)
	public void swapNumbersWithoutThirdVariable() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = input.nextInt();
		System.out.println("Enter number:");
		int b = input.nextInt();
		System.out.println("Before swapping,");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("After swapping,");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A = "+a);
		System.out.println("B = "+b);		
	}
	
	// Find sum of digits in java
	@Test(enabled = false)
	public void sumOfDigits() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = input.nextInt();
		int result = 0;
		int rem = 0;
		while(a != 0){
			rem = a % 10;
			result += rem;
			a = a / 10;
		}
		System.out.println(result);
	}
	
	// Check Even or Odd without using modulus and division
	@Test(enabled = false)
	public void evenOrOddWithoutModuDiv() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int value = input.nextInt();
		if((value & 1) == 0)
			System.out.println("Even") ;
		else
			System.out.println("Odd");
	}
	
	// String Reverse Without using String API
	@Test(enabled = false)
	public void reverseStringWithoutAPI() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		String value = input.nextLine();
		char[] result = new char[value.toCharArray().length];
		for (int i = 0; i < value.toCharArray().length; i++) {
			result[i] = value.charAt(value.toCharArray().length - 1 -i);
		}
		System.out.println(result);
	}
	
	@Test(enabled = false)
	public void getPow() {
		System.out.println(pow(12,7));
		System.out.println(Math.pow(12, 7));
	}
	
	double pow(double base, double power){
		double result = 1;
		int itr = 0;
		while (itr < power){
			result = result * base;
			itr++;
		}
		return result;
	}
	
	// Check string is palindrome or not?
	@Test(enabled = true)
	public void findPalindrome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name:");
		String value = input.nextLine();
		char[] actual = value.toCharArray();
		char[] expected = new char[actual.length];
		for (int i = 0; i < actual.length; i++) {
			expected[i] = actual[actual.length - i - 1];
		}
		if(String.valueOf(expected).equals(String.valueOf(actual)))
			System.out.println("Is Palindrome");
		else
			System.out.println("Is Not a Palindrome");
	}
	
	// Reverse a number in java?
	// Fibonacci series with Recursive?
	// Fibonacci series without using Recursive?
	// Sort the String using string API? 
	// Sort the String without using String API?
	// How to find largest element in an array with index and value ?
	// Sort integer array using bubble sort in java?
	// Check armstrong number or not?
	// Multiply 2 Matrices
	// Explain return type in java
	// Can we call Sub class methods using super class object?
	// Can we Override private methods ?

	// Java Program to Print prime numbers?
	// What happens if we place return statement in try catch blocks
	// Write a java program to convert binary to decimal
	// Java Program to convert Decimal to Binary
	// Is it possible to print message without using System.out.println()
	// Java program to restrict a class from creating not more than three
	// objects
	// Java basic interview programs on this keyword
	// Java Program to Sort elements of Java ArrayList Example
	// Interfaces allows constructors?
	// Can we create static constructor in java
	// Super keyword interview questions java
	// Java interview questions on final keyword
	// Can we create private constructor in java
	// Java Program Find Second highest number in an integer array
	// Java interview programming questions on interfaces
	// Top 15 abstract class interview questions
	// Java interview Questions on main() method
	// Sort employee object by id in descending order using comparable and
	// TreesSet
	// Top 20 collection framework interview Questions
	// Java Interview Program to find smallest and second smallest number in an
	// array
	// Java Coding Interview programming Questions : Java Test on HashMap
	// Explain java data types with example programs
	// How to check internet connection using java
	// Constructor chaining in java with example programs
	// Top 10 Interview Programs and questions on method overriding in java
	// Swap two numbers without using third variable in java
	// Find sum of digits in java
	// How to create immutable class in java
	// AtomicInteger in java
	// Check Even or Odd without using modulus and division
	// String Reverse Without using String API
	// Find Biggest substring in between specified character
	// Check string is palindrome or not?
	// Reverse a number in java?
	// Fibonacci series with Recursive?
	// Fibonacci series without using Recursive?
	// Sort the String using string API?
	// Sort the String without using String API?
	// what is the difference between method overloading and method overriding?
	// How to find largest element in an array with index and value ?
	// Sort integer array using bubble sort in java?
	// Object Cloning in java example?
	// Method Overriding in java?
	// Program for create Singleton class?
	// Print numbers in pyramid shape?
	// Check armstrong number or not?
	// Producer Consumer Problem?
	// Remove duplicate elements from an array
	// Convert Byte Array to String
	// Print 1 to 10 without using loops
	// Add 2 Matrices
	// Multiply 2 Matrices
	// How to Add elements to hash map and Display
	// Sort ArrayList in descending order
	// Sort Object Using Comparator
	// Count Number of Occurrences of character in a String
	// Can we Overload static methods in java
	// Can we Override static methods in java
	// Can we call super class static methods from sub class
	// Explain return type in java
	// Can we call Sub class methods using super class object?
	// Can we Override private methods ?
	// Basic Programming Questions to Practice : Test your Skill
	// Java programming interview questions on collections

}
