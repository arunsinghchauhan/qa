package assignments;

import java.util.Scanner;

public class Assignment4 {
 
	static int i;
	
	public static void main(String[] args) {
 
		
		
			System.out.println("Enter your age: ");
			Scanner read= new Scanner(System.in);
			i=read.nextInt();
			read.close();
		
	Person p=new Person(i);
	p.amIOld();
	p.yearPass();
	p.amIOld();
	
	
	}

}



class Person
{
	int age;
	Person(int initialAge)
	{
		if(initialAge>0){
			age=initialAge;
			
			System.out.println("You entered age in positive");
		}
		
		else{
			age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		
	}
	
	
	
	void yearPass()
	{
		for(int x=1;x<=13;x++){
		age=age+1;
		System.out.println("Your age after one year is: "+age);
		}
	}
	
	void amIOld()
	{
		if(age<13 && age>0)
		{
			System.out.println("You are young");
		}
		else if(age>=13 && age<18)
		{
			System.out.println("You are teeneger");
		}
		else if(age>=18)
		{
			System.out.println("you are old now");
		}
		else{
			System.out.println("you entered invalid format");
		}
	}
	
	
	
	
}
