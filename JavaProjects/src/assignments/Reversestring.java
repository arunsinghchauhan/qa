package assignments;

import java.util.Scanner;

public class Reversestring {
	
	
	String arr[];
	int i,j;
	
	void calculate()
	{
		
		
		arr=new String[3];
		System.out.println("Enter three strings: ");
		Scanner read= new Scanner(System.in);
		//read.close();
		for(i=0;i<3;i++)
		{
		arr[i]=read.nextLine();
		}
	}	
	
	void toReverse()
	{
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Reversestring rs= new Reversestring();
		rs.calculate();
        rs.toReverse();
	}

}
