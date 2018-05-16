package assignments;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Scanner;

public class Circle extends Shape {
	
	String[] arr = new String[5];
	Scanner read = new Scanner(System.in);
	int counter;

	public void insert()
	{
		
		for(counter = 0; counter<6; counter++)
		{
		if(counter <5)
		{
			System.out.println("Enter value");
			arr[counter] = read.next();
		}
		else
		{
//			for(int i =0; i<arr.length-1;i++)
//			{
//			arr[i] = arr[i+1];
//			}
			counter--;
		}
		}
		option();
	}
	
	
	public static void main(String[] args)
	{
		Circle C = new Circle();
		C.insert();
		
	}
	
}
