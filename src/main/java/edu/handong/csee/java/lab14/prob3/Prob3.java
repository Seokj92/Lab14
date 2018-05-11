package edu.handong.csee.java.lab14.prob3; //package name

import java.util.Scanner; //import java.util.Scanner package

class Powercalc { //declare a class
	public long power(int n, int p) throws Exception // power method throw Exception when the Exception happens.
	{
		long result = 0; //declare a long variable

		result = (long)Math.pow(n, p); //initiate result with n^p
		if(n<0 || p<0) //if n<0 or p<0
		{
			throw new Exception("n or p should not be negative."); //make instance of Exception class and Exception happens when n<0 or p<0  
		}
		if(n==0 && p==0) //if n=0 or p=0
		{
			throw new Exception("n and p should not be zero."); //make instance of Exception class and Exception happens when n=0 or p=0
		}
		return result; //return the value of result
	}
}

public class Prob3 { //declare a class
	public static final Powercalc calculator = new Powercalc(); //instantiate Powercalc class.
	public static final Scanner sc = new Scanner(System.in); //make a Scanner instance to get the number from keyboard

	public static void main(String[] args) { //this is a main method
		while(sc.hasNextInt()) { //loop runs when value is int type value.
			int n = sc.nextInt(); //initiate variable n with input from user
			int p = sc.nextInt(); //initiate variable p with input from user

			try { //try-catch statement 
				System.out.println(calculator.power(n, p)); //this is where the exception happens
			} catch (Exception e) { //deal with exception
				System.out.print(e); //print out message when exception happens.
			}
		}
	}
}