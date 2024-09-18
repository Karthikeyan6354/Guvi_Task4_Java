package task4.Guvi_Task4_Java;

import java.util.Scanner;

public class Question2<StringOutofBoundException> {

	public static void main(String[] args) 
	{
		// Array Index out of Bound Exception
		int a[]=new int [3];           //declared length of an array is 4
		Scanner sc=new Scanner(System.in);        //declaring scanner class
		System.out.println("Enter the values: ");
		try                     //try block to handle the arrayindexoutofbound exception
		{
		  for (int i=0;i<=a.length;i++)   //length of an array is 3, Here I'm taking input until 4
		  {                               //While trying to get value for index 4, it will throw the exception
		   a[i]=sc.nextInt();        //getting integer inputs from console
		  }
		}
		catch(ArrayIndexOutOfBoundsException e)     //Caught this ArrayIndex exception from try block
		{
			System.out.println("Array Index Out of Bound Exeption: "+e.getMessage());
		}
	
	//String Out of Bound exception
	String msg="Welcome";     //declared String type msg with value
	System.out.println("Size of the String is: "+msg.length()); //size of the string is 7
	try                                   //try block for below statement to throw the exception
	{
		System.out.println(msg.charAt(8));   //Try to get the character at 8th position of the above string
	} 
	catch(StringIndexOutOfBoundsException e)  //Caught this mentioned exception from try block
	{
		System.out.println("String Index Out of Bound Exception: "+e.getMessage());
	}

}
}

