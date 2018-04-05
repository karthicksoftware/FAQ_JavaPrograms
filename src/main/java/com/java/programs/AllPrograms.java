package com.java.programs;

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
	// What happens if we place return statement in try catch blocks
	// Write a java program to convert binary to decimal
	// Java Program to convert Decimal to Binary
	// Interfaces allows constructors?
	// Can we create private constructor in java
	// Java interview Questions on main() method
	// Explain java data types with example programs
	// Swap two numbers without using third variable in java
	// Find sum of digits in java
	// Check Even or Odd without using modulus and division
	// String Reverse Without using String API
	// Check string is palindrome or not?
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

}
