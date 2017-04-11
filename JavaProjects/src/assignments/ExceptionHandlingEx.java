package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx {
	
	Scanner read= new Scanner(System.in);
	double array[];
	int length1,element,arrposition1,arrposition2;
	int x,y;

	
	public void arrInput()
	{
		
	
		System.out.println("Enter the length of the array: ");

		try
		{
			//Scanner read1= new Scanner(System.in);
			length1= read.nextInt();
			System.out.println("Check 0");
			read.hasNextInt();
			System.out.println("Check 1");
			//System.out.println(read.hasNextInt());
			System.out.println("Check 2");
			
			
		}
		 catch(InputMismatchException e)
		{
			System.out.println("Please enter the integer value");
			//length1=0;
			
			arrInput();
				
		}
		
		array=new double[length1];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<array.length;i++)
		{
			array[i] = read.nextInt();
			//element=read.nextInt(); 
		}
	}
	
	
	public void dividearr()
	{
		System.out.println("Enter the position of element you want as dividend from the array");
		x=read.nextInt();
		
		double arrposition1=array[x];
		//System.out.println(array[x]);
		
		System.out.println("Enter the position of element you want as divisor from the array");
		
		y=read.nextInt();
		double arrposition2=array[y];
	//	System.out.println(array[y]);
		
		double quotient= arrposition1/arrposition2;
		System.out.println("The quotient of the division of the two elements is: "+quotient);
	}


	public static void main(String[] args) {
		ExceptionHandlingEx eh= new ExceptionHandlingEx();
		//try {
		eh.arrInput();
		eh.dividearr();
		}
//		catch (InputMismatchException e)
//		{
//			System.out.println("Please enter the integer value");
//			eh.arrInput();
//			
//		}
//		catch (ArrayIndexOutOfBoundsException a)
//		{
//			System.out.println("Please enter the number below the total length");
//		}
		
	//}

}
