package assignments;

import java.util.Scanner;

public class Args {

	public static void main(String args[]) {
try
{
		int divisor,dividend,remainder,length, element;
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter dividend");
		dividend= read.nextInt();
		System.out.println("Please enter divisor");
		divisor= read.nextInt();
		remainder = dividend/divisor;
		System.out.println("Remiander is " + remainder);
		System.out.println("Enter the length of array");
		length= read.nextInt();
		int arr[] = new int[length];
		System.out.println("Which elemnent of the array you want to access");
		element= read.nextInt();
		System.out.println(arr[element]);

	System.out.println("Remainder is " + remainder);
}
catch(ArithmeticException ar)
{
	System.out.println("Either You are trying to divide by zero");
	
}
catch (ArrayIndexOutOfBoundsException AI)
{
	System.out.println("You are acessing a value of array which does not exists");
}
//catch(Exception e)
//{
//	System.out.println("You are doing something wrong");
//}
finally
{
	System.out.println("Hello");
}

		
		
	}

}
