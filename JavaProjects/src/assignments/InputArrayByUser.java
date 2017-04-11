package assignments;
import java.util.Scanner;

public class InputArrayByUser {

	int arr[]= new int[10];
	int i;
	
	public void takeInputByUser()
	{
	System.out.println("Enter 10 numbers in order to continue: ");	
	for(i=0;i<=9;i++)
	  {
	Scanner read= new Scanner(System.in);
	arr[i]= read.nextInt();
	  }	
	}
	
	void perform()
	{
		System.out.println("Your input in reciprocal form:");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		InputArrayByUser obj1= new InputArrayByUser();
		obj1.takeInputByUser();
		obj1.perform();
	}

}
