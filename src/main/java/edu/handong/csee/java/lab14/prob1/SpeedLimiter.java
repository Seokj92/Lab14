package edu.handong.csee.java.lab14.prob1; //package name

import java.util.Scanner; //import java.util.Scanner package
import java.util.Random; //import java.util.Random package

class SpeedLimitterIncludingException { //define a class including exception

	private int speed = 0; //declare a int variable (it is defined private)
	private int limit = 0; //declare a int variable (it is defined private)
	public SpeedLimitterIncludingException(int limit, int speed) //This is a constructor
	{
		this.limit = limit; //initiate variable limit
		this.speed = speed; //initiate variable speed
	}

	public void warningFunction() //declare a method
	{
		try { //This is try-catch statement. exception can happens in try block.
			if(this.speed > this.limit) // if speed is bigger than limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); // make instance of exception class and exception happens when speed is bigger than limit 
			}
			System.out.println("you are a law abiding citizen!"); //print out this string
		} catch(Exception e) { //try-catch statement, deal with exception
			System.out.println(e.getMessage()); //print out the string that has cause of exception.
			System.out.println("You are being fined. "); //print out this sentence(when exception happens)
		}
		System.out.println("Your current speed : " + this.speed); //print out current speed.
	}
}

public class SpeedLimiter { //define a public class

	public static void main(String[] args) { //This is a main method
		Scanner sc = new Scanner(System.in); //make the Scanner instance to get the number from keyboard
		Random rand = new Random(); //make a rand instance to make random numbers
		int limit = 0, speed = 0; //declare a int variable

		System.out.print("Set the speed limit, Officer : "); //print out this sentence
		limit = sc.nextInt(); //initiate value limit with input from user
		speed = rand.nextInt(101); //initiate value speed with random number(0~100)

		SpeedLimitterIncludingException restriction = new SpeedLimitterIncludingException(limit, speed);//make a restriction instance(instantiate SpeedLimitterIncludingException class)

		restriction.warningFunction(); //call the waringFunction method in restriction instance.
	}

}