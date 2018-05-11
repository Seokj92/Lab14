package edu.handong.csee.java.lab14.prob5; //package name

import java.util.Scanner; //import java.util.Scanner package

class MyException extends Exception { //MyException class inherit Exception
	private String message = null; //declare String variable and initiate it with null

	public MyException() { //This is constructor
		super();//call the constructor of sup class
	}

	public MyException(String message) { //this is constructor
		super(message); //call the constructor of sup class with parameter
		this.message = message; //initiate value of message
	}

	public MyException(Throwable cause) { //This is constructor
		super(cause); //initiate value of cause
	}

	public String toString() { //declare a method
		return message; //return the string
	}
}

public class Prob5 { //declare a class
	public static void main(String[] a) { //This is a main method
		try { //try-catch statement, exception can happen in try block
			Scanner sc = new Scanner(System.in); //make the scanner instance to get the string from keyboard.
			String str = sc.nextLine(); // declare string variable and initiate it with input from user.
			Prob5.myTest(str);// call myTest method in Prob class
		} catch(MyException mae) { //deal with exception.
			System.out.println("Inside catch block : " + mae); //print out thie sentence
		}
	}

	static void myTest(String str) throws MyException{ //myTest method throws exception when exception happens
		if(str.equals("null")) { //if string value is null
			throw new MyException("String val is null"); //make instance of Exception class and Exception happens when string value is null
		}
		else //if string value is not null
			System.out.println("String val is : " + str); //print out this sentence.
	}
}