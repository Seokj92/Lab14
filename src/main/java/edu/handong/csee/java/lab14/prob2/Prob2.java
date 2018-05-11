package edu.handong.csee.java.lab14.prob2; //package name

import java.util.*; //import java.util package

class Exception { //declare a class

	private int x=0; //declare int variable(it is defined private) 
	private int y=0; //declare int variable(it is defined private)

	public void error() { //declare a method

		try { //try-catch statement, exception can be happen in try block
			Scanner sc = new Scanner(System.in); //make the scanner instance to get the number from keyboard
			System.out.print("x : "); //print out this sentence
			x = sc.nextInt(); //initiate the value x with input from user
			System.out.print("y : "); //print out this sentence
			y = sc.nextInt(); //initiate the value y with input from user
			System.out.println(this.x/this.y); //print out the result of x/y
		}
		catch(ArithmeticException e) { //try-catch statement, deal with ArithmeticException(Exception class for error situations in math operations)
			System.out.println("java.lang.ArithmeticException : " + e.getMessage()); //print out this sentence
		}
		catch(InputMismatchException e) { //try-catch statement, deal with InputMismatchException(Exception class for error situations in type of input mismatch) 
			System.out.println("java.util.InputMismatchException"); //print out this sentence
		}
	}
}

public class Prob2 { //declare a public class
	public static void main(String[] args) { //this is a main method
		int x; //declare int variable
		int y; //declare int variable
		Exception exc = new Exception(); //instantiate Exception class
		exc.error(); //call the error method in exc instance.
	}
}