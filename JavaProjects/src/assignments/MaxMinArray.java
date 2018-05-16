package assignments;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MaxMinArray {
	int n, max = 0;
	int array[] = new int[5];
	Scanner read = new Scanner(System.in);

	
	
	public void takeInputsize() {
		try
		{	
		System.out.println("Enter size of the array: ");
		n = read.nextInt();
		System.out.println("-----------------------");
	} catch(InputMismatchException e)
	{
		System.out.println("Please enter any numerical value");
		
	}
		
	}
	
	public void getvalues() {
		try
		{System.out.println("Please enter the array number one by one");
			for (int i = 0; i < n; i++) 
		{
			array[i] = read.nextInt();
		}
		} catch(InputMismatchException e)
		{
			System.out.println("Please enter any numerical value");
			
		}
		
	}

	public void calculateMaxMin() {
		for (int i = 0; i < n; i++) 
		{
			
			if (max < array[i])
			 max = array[i];

		}

		System.out.println("The maximum value in the array provided: " + max);

		for (int i = 0; i < n; i++) 
		{
			if (max > array[i])
			 max=array[i];

		}

		System.out.println("The minimum value in the array provided: " + max);
	}

	public static void main(String[] args) {

		MaxMinArray m = new MaxMinArray();
		m.takeInputsize();
		
		m.getvalues();

		// m.printarrayvalue();
		 m.calculateMaxMin();
	}

}
