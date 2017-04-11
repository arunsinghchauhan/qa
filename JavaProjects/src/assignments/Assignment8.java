package assignments;

import java.util.Scanner;

public class Assignment8 {
 
	String value;
	//int value1;
	//boolean value2;
	
	
	void takeInput()
	{
		System.out.println("Enter a word u want to check:");
		Scanner read= new Scanner(System.in);
		value= read.next();
		//value1=read.nextInt();
		//value2=read.hasNextBoolean();
	}
	
	void display()
	{
		switch(value)
		{
		case "a": 
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":
		
		System.out.println("You enter a vowel");
		break;
		default:System.out.println("Not a vowel or invalid character");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Assignment8 A8=new Assignment8();
		A8.takeInput();
		A8.display();
		

	}

}
