package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Voting {

int waitforyears,yearofbirth, age;
String s,c,v;

	public void yob()
{
	//System.out.println("Please enter your year of birth in YYYY format\n");
	
	try
	 {
		Scanner read= new Scanner(System.in);
		yearofbirth= read.nextInt();
	 	 if (yearofbirth < 1817 || yearofbirth > 2017)
		 {
			 System.out.println("Please enter valid YOB");
			 yob();
		 }
	
		 else if(yearofbirth > 1999)
		 {
		 this.ageCalculation();
		 System.out.println("You are not eligible to vote"+ " you have to wait for" + " " + waitforyears + " " +  "years" );
		 }
		 	else
		 	{
		 		this.sex();
		 	}
	  }
	
	 catch(InputMismatchException e) 
	 {

		 System.out.println("Please Enter valid YOB in YYYY Format");	 
		 yob();
		 
		 
	 }
}


public void sex()
{
	System.out.println("Please enter your sex(Male/Female)");
	

		int check = 0;
		while(check==0)
		{
			Scanner read= new Scanner(System.in);
			 s= read.next();
			if (s.equalsIgnoreCase("Male") || s.equalsIgnoreCase("Female"))
				{
			 			this.country();
			 			
			 		check++;
			 	}
			else
				{
					System.out.println("Please enter valid Sex");
					
				}
		}

	 
}

public void ageCalculation()
{
 age = (2017- yearofbirth) ;
 waitforyears = (18-age);
}
public void country()
{
	System.out.println("Please enter your country");
	Scanner read= new Scanner(System.in);
	 c= read.next();
	 if (c.equalsIgnoreCase("India"))
		{
			this.vote();
			if(v.equalsIgnoreCase("yes"))
			{
				System.out.println("Please go to" +" " + s +" " + "Booth for voting" );
			}
			else
			{
				System.out.println("Thanks for your time");
			}
		}
		else
		{
			System.out.println("You are not Eligible for voting in India");
		}
	
}

public void vote()
{
	System.out.println("Do you want to vote(Yes/No)");
	Scanner read= new Scanner(System.in);
	v= read.next();
}
	
	
	public static void main(String[] args) {

		Voting vote= new Voting();
		System.out.println("Please enter your year of birth in YYYY format");
		vote.yob();
		
		
	}

}
