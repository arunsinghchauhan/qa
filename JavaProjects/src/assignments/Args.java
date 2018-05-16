package assignments;

import java.util.Scanner;

public class Args {

	
	public static void main(String args[]) {
try
{
		int divisor,dividend,result,length, element;
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter dividend");
		dividend= read.nextInt();
		System.out.println("Please enter divisor");
		divisor= read.nextInt();
		result = dividend/divisor;
		System.out.println("Remiander is " + result);
		
		System.out.println("Enter the size of the array: ");
		length= read.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i] = read.nextInt();
		}
		
		System.out.println("You entered: ");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j] + " ");
		}
			
		System.out.println("=============================");
		System.out.println("Which elemnent of the array you want to access");
		element= read.nextInt();
		System.out.println(arr[element]);

}
catch(ArithmeticException ar)
{
	System.out.println("Either You are trying to divide by zero");
	
}
catch (ArrayIndexOutOfBoundsException AI)
{
	System.out.println("You are acessing a value of array which does not exists");
}
catch(Exception e)
{
	System.out.println("You are doing something wrong");
}
//finally
//{
//	System.out.println("Hello");
//}

		
		
	}

}
