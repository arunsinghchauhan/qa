package assignments;

import java.util.Scanner;


public class Arrstring {
	String arr[];
	Scanner read=new Scanner(System.in);
	String s;
	int i;
	void takestring()
	{
		System.out.println("Enter any string: ");
		s=read.nextLine();
		System.out.println("You entered the string:" +s);
		
	}
	
	void reverse()
	{
		arr=new String[4];
		for (i=0;i<4;i++)
		{
			arr[i] = read.nextLine();
		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("Your string in array form:"+ arr);
		
		
		
	}
	
	public static void main(String args[])
	{
		Arrstring as= new Arrstring();
		as.takestring();
		as.reverse();
	}
	
}


