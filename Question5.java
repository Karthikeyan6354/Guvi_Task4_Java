package task4.Guvi_Task4_Java;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) 
	{
		// Remove all the elements from Array List
		ArrayList <String> al=new ArrayList<String>(); //Creating ArrayList with String data type
		al.add("Apple");   //adding the string values by using add method to ArrayList
		al.add("Mango");
		al.add("Orange");
		al.add("Papaya");
		System.out.println("Before removing, Old Array list: "+al);
		//Method 1 - To remove multiple elements from Arraylist, Creating another arraylist to store, whatever elements wants to remove
		ArrayList <String> al2=new ArrayList <String>();
		al2.addAll(al);            //adding all the elements to new array list - al2
				
		al.removeAll(al2);        // this method remove the elements in al from al2 list
		System.out.println("After removing the old array list");
		System.out.println("Is Old Array List empty: " +al.isEmpty());   //Is checking the arralist is empty or not
		
		System.out.println("Old Array list elements: " +al);      //elements from old array list
		System.out.println("New Array List elements: " + al2);    //elements from New array list
		
		//Method 2 - Clear method - this will completely remove all the elements
		
		al2.clear();                //this will remove everything
		
		System.out.println("After removing New Array List elements: " + al2);
		

	}

}
