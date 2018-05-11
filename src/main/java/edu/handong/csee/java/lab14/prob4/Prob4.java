package edu.handong.csee.java.lab14.prob4; //package name

import java.util.Scanner; //import java.util.Scanner package

class Boundary { //declare a class
	private static int [] arr = new int[5]; //make an 1-D array
	private static int count = 0; //declare and initiate int variable
	public void receive(int num) throws ArrayIndexOutOfBoundsException //receive method throws exception when the ArrayIndexOutOfBoundsException happens
	{
		int i = count; //declare int variable and initiate it with value of count
		arr[i] = num; // initiate the value of array element.
		count++; //increase value of count
		System.out.printf("arr[%d] <- %d\n", i, num); //print out value of array element.
	}
}

public class Prob4 { //declare a class
	public static void main(String[] args) //this is a main method
	{
		Scanner sc = new Scanner(System.in); //make Scanner instance to get the number from keyboard
		int num = 0; //declare a int variable
		Boundary arr = new Boundary(); //instantiate Boundary class.
		while(true) // infinite loop
		{
			try //try-catch statement, exception can happen in try block
			{
				System.out.print("Enter an integer : "); //print out this sentence
				num = sc.nextInt(); //initiate num value with input from user 
				arr.receive(num); //call the method receive from arr instance
			}
			catch(ArrayIndexOutOfBoundsException e) // deal with ArrayIndexOutOfBoundsException
			{
				System.out.println("Invalid array index access!"); //print out this sentence
				break; //get out of the infinite loop
			}
		}

	}
}