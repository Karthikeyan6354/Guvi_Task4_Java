package task4.Guvi_Task4_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String> employee=new TreeMap<Integer, String>();  //Created Tree map with Integer and String value pairs
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of pairs, you want to add: ");
		int a=sc.nextInt();
		System.out.println("Enter the pairs for Emplyee Id and Employee name: ");
		for (int i=0;i<a;i++)     //getting the Key - Values pairs through for loop
		{
		  int eid=sc.nextInt();
		  String ename=sc.next();
		  employee.put(eid, ename);
		}
				
		System.out.println("Pairs from Tree Map: " +employee);   //Pairs from Tree Map
		System.out.println();
		System.out.println("Before sorting the values: " + employee.values());
				
		ArrayList <String> enames=new ArrayList <String>(employee.values()); //converting TreeMap values to Array list to sorting the values
		Collections.sort(enames);    //Sort method from collection interface to sort the values
		System.out.println();
		System.out.println("After Sorting the values in alphabetical order:");
		    
		System.out.println(enames);
		
		

	}

}
