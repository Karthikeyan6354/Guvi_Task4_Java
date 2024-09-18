package task4.Guvi_Task4_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Converting List to Array
		
		List <String> al1=new ArrayList<String>();  //Create List with the help of Arraylist Object
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements, you want to add:");
		int size=sc.nextInt();   //getting the size of array list
		System.out.println("Enter the names here");
		for (int i=0;i<size;i++)
		{
			String concept=sc.next();   //getting the string as input
			al1.add(concept);           //adding that string input to Array by using add method
		}
		System.out.println("Elements from the List: "+al1);
		System.out.println();
		
		String oops[]=new String[size];    // created String array with size
		
		al1.toArray(oops);   // Converting the elements from list to Array, with string Object
		System.out.println("After Converting Elements from List to Array: ");
		for (String concept:oops)        //Enhanced for loop for print the names from the Array
			System.out.println(concept);      //Printing the values from Array
		
	
	}

}
