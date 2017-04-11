package assignments;
import java.util.Scanner;
public class Assignment6 {
 
	int size_of_array,i;
	int arr[];
	Scanner read=new Scanner(System.in);
	void takeInput()
	
	{
		System.out.println("Enter the size of the array");
		size_of_array=read.nextInt();
	}
	
	void read_array()
	{
		arr=new int[size_of_array];
		
		System.out.println("Enter the numbers of array one by one:");
		
		for(i=0;i<size_of_array;i++)	
		{
			arr[i] = read.nextInt();
			
		}
		this.print_array(arr);
		}
	
	public void print_array(int[] arr)
	{
		System.out.print("[");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
	public void print_array(String[] arr)
	{
		System.out.print("[");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
	
	
	
	
	public static void main(String[] args) {

		Assignment6 A6= new Assignment6();
		A6.takeInput();
		A6.read_array();
	}

}
