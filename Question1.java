package task4.Guvi_Task4_Java;

import java.util.Scanner;   //importing the scanner class package

public class Question1 {

	public static void main(String[] args) 
	{ 
		//To handle the divide by zero exception
		Scanner sc=new Scanner (System.in);        //declaring scanner class
		System.out.println("Enter the 2 values for division: ");
		int a=sc.nextInt();          //getting integer inputs from console
		int b=sc.nextInt();
		try                                  //to handle the exception from the below statement
		{
			System.out.println(a/b);         //throws arithmetic exception - divide by zero
		}
		catch (ArithmeticException e)       //To catch, if any arithmetic exception from try block   
		{
			System.out.println("Arithmetic Exception Occured: "+ e.getMessage());   //to print the exception by using the getMessage method
		}
        System.out.println("Remaining steps will work"); //We have handled the divide by zero exception, so program will not interrupt, remaining steps will work
	}

}
