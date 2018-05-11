package edu.handong.csee.java.lab14.prob6; //package name

import java.util.Scanner; //import java.util.Scanner package

class CustomID extends Exception{ //CustomID class inherits Exception class
	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"}; //declare 1-D array(String type)
	private String name = ""; //declare string variable(it is defined private)
	private int age = 0; //declare int variable(it is defined private)
	private String race = ""; //declare string variable(it is defined private)
	private int state = 0; //declare int variable(it is defined private)

	public void set_Name(String str) throws Exception //method set_Name throws exception when exception happens
	{
		if(str.length() < 5) { //if the string length is smaller than 5
			state = 0; //initiate state value with 0
			throw new Exception("Your name is short! try again!"); //make instance of Exception class and print out this sentence when exception happens.

		}
		else { //if not
			this.name = str; //initiate variable name with str value
			System.out.println("Name is valid"); //print out this sentence
			System.out.println("Name : " + this.name); //print out thie sentence
			state++; //increase state value
		}
	}


	public void set_Age(int num) throws Exception //method set_Name throws exception when exception happens
	{
		if(num < 18) { //if num is smaller thatn 18
			state = 1; //initiate state variable with 1
			throw new Exception("You are too young! Try again!"); //make instance of Exception class and print out this sentence when exception happens.

		}
		else { //if not
			this.age = num; //initiate variable age with num value
			System.out.println("Age is valid"); //print out this sentence
			System.out.println("Age : " + this.age); //print out this sentence
			state++;
		}
	}

	public void set_Race(String race) throws Exception { //method set_Race throws exception when exception happens.
		for(int i = 0; i < races.length; i++) //for statement that runs until i is smaller than length of races array.
		{
			if(races[i].equals(race)) { //if the races[i] is equals to race 
				this.race = races[i]; //initiate race value with races[i]
				System.out.println("Race is valid"); //print out this sentence
				System.out.println("Race : " + races[i]); //print out this sentence
				state = 0; //initiate state value with 0
				return; //finish this method

			}
		}
		state = 2; //initiate state value with 2
		throw new Exception("Human! Try again"); ////make instance of Exception class and print out this sentence when exception happens.

	}
	public int get_State() //declare a method to return the state.
	{
		return state; //return state(return type is int)
	}
}

public class Prob6 { //declare a public class
	public static void main(String[] args) { //this is a main method
		String name, race; //declare a string variable
		int age = 0; //declare a int variable
		Scanner sc = new Scanner(System.in); //make a Scanner class to get input from keyborad
		CustomID obj = new CustomID(); //instantiate CustomID class
		
		while(true) //infinite loop
		{
			try { //try-catch statement, exception can happens in try block.
				if(obj.get_State()==0) { //call the get_state() method from obj instance and if value of that method is equals to 0
					System.out.print("Enter your name : ");; //print out this sentence
					name = sc.nextLine(); //get the name value from user
					obj.set_Name(name); //set the name value by calling set_Name method from obj instance
				}
				else if(obj.get_State() ==1) {//call the get_state() method from obj instance and if value of that method is equals to 1
					System.out.print("Enter your age : ");;//print out this sentence
					age = sc.nextInt(); //get the age value from user
					sc.nextLine(); //get the enter(\n) input
					obj.set_Age(age); //set the age value by calling set_Age method from obj instance.
				}
				else if(obj.get_State()==2) { //call the get_state() method from obj instance and if value of that method is equals to 2
					System.out.print("Enter your race : ");//print out this sentence
					race = sc.nextLine();//get the race value from user
					obj.set_Race(race);//set the race value by calling set_Race method from obj instance
				}
			}
			catch(Exception e) { //deal with exception
				System.out.println(e.getMessage()); //print out the string that has cause of exception.
				continue;//go back to loop(go back to try block)
			}
		}

	}
}