package task4.Guvi_Task4_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args)
	{
		// Handling File Not Found Exception
		try               //To throw and handle the File not found exception for below statement
		{   
			FileInputStream file=new FileInputStream("math.txt");  //Provide the incorrect file as Input
			Scanner scan=new Scanner(file);   //reading the files through scanner class
			while (scan.hasNextLine())    //Checking whether nextline having any elements
			{
			  String line = scan.nextLine();     //Storing the information to String Line 
              System.out.println(line);          //printing that line 
            }
            scan.close();           //after reading the input, closing the file
        } 
		catch (FileNotFoundException e)  //to catch the file not found exception from try block
		{
            System.out.println("An error occurred:"+e.getMessage());
            e.printStackTrace();
        }

	}

}
