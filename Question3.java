package task4.Guvi_Task4_Java;

import java.util.Scanner;

public class Question3 
{
	public static void validateAge(int age) throws InvalidAgeException //created InvalidAgeException class manually
	{
		if (age <18)
		
			throw new InvalidAgeException("You are not elibile");  //it will throw the message, when age less than 18
		else
	    	System.out.println("You are eligible");
	}
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();          //getting input from user console
		try                  //to throw and handle the exception, when age less than 18
		{   
			validateAge(age);
		}
        catch(InvalidAgeException e)  //Caught the exception, when try block throw the exception 
		{
        	System.out.println("Invalid Age Exception Occured: " + e.getMessage());
        }
	}

}
