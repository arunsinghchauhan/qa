package assignments;

import java.util.Scanner;

public class Shape {
	String[] arr = new String[5];
	String[] arr1;
	int i=0, length,j;
	String option;
	Scanner read = new Scanner(System.in);

	public void array()
	{
		
		try
		{
			for(i =0;i<10;i++)
			{
				System.out.println("Enter element");
				arr[i] = read.next();
			}
		}
		catch(Exception E)
		{
			length = (arr.length)*2;
			arr1 = new String[length];
			for(j=i-1;j>=0;j--)
			{
				arr1[j] = arr[j];
					
			}
			for(;i<7;i++)
			{
				System.out.println("Enter element");
				arr1[i] = read.next();
			}
		}
		option();
	}
	
	public void option()
	{
		System.out.println("All values inserted in array, do you want to print the array");
		option = read.next().toLowerCase();
		if(option.equals("yes")||option.equals("y"))
		{
			print_array();
		}
		else
		{
			System.out.println("Thanks");
		}
	}
	public void print_array()
	{
		System.out.println("Your array is");
		for (int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Shape S = new Shape();
		S.array();

	}

}
