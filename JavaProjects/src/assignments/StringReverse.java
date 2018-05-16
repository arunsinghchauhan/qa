package assignments;

import java.util.Scanner;

public class StringReverse {
	
	String str;
	String newstring="";
	int l;
	String arr[];
	Scanner read= new Scanner(System.in);
	public void taking()
	{
		System.out.println("Enter the string");
		str=read.next().toLowerCase();
	     l=str.length();	
		arr=new String[l];
		arr = str.split("");
     
	}
	
	void reverseit()
	{
		
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(arr[i]);
			//newstring= newstring + str.charAt(i);
		}
		
	//	System.out.println("The reverse of this string is: "+newstring);
	}
	public static void main(String[] args) {
		
		StringReverse sr= new StringReverse();
		sr.taking();
		sr.reverseit();
	}

}
