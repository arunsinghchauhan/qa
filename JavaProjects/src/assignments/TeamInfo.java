package assignments;

import java.util.Scanner;

public class TeamInfo {

	int num;
	int id;
	long mobileno;
	String firstname, lastname,birthplace;
	
	public void option()
	{
		System.out.println("Hi there, which of the following options do you want to access your information:" + "\n" + "Press 1 for ID, 2 for First Name, 3 for Last name, 4 for Mobile number and 5 for Birth Place");
		Scanner read= new Scanner(System.in);
		num=read.nextInt();
		switch (num)
		{
		case 1: 
		System.out.println("Enter your ID");
		id = read.nextInt();
		if(id == 3578)
		{
			info_mayank();
		}
		else if(id == 1576)
		{
			info_rahul();
		}
		break;
		case 2:
			System.out.println("Enter your First Name");
			firstname = read.next();
			if(firstname.equalsIgnoreCase("mayank"))
			{
				info_mayank();
			}
			else if(firstname.equalsIgnoreCase("rahul"))
			{
				info_rahul();
			}
		break;
		case 3:
			System.out.println("Enter your Last Name");
			firstname = read.next();
			if(firstname.equalsIgnoreCase("kakkar"))
			{
				info_mayank();
			}
			else if(firstname.equalsIgnoreCase("verma"))
			{
				info_rahul();
			}
		break;
		case 4: 
			System.out.println("Enter your Mobile Number");
			mobileno = read.nextInt();
			if(mobileno == 961032200)
			{
				info_mayank();
			}
			else if(mobileno == 995850909)
			{
				info_rahul();
			}
		break;
		case 5: 
			System.out.println("Enter your Birth Place");
			birthplace = read.next();
			if(birthplace.equalsIgnoreCase("ganganagar"))
			{
				info_mayank();
			}
			else if(birthplace.equalsIgnoreCase("meerut"))
			{
				info_rahul();
			}
		break;
		default:System.out.println("not exist");
		}
		
		
	}
	
	void info_mayank()
	{
	System.out.println("ID: 3578" + "\n" + "First Name: Mayank"+ "\n" + "Last Name: Kakkar" + "\n" + "Mobile: 9610322000" + "\n" + "BirthPlace: GangaNagar");
	}
	
	void info_rahul()
	{
	System.out.println("ID: 1576" + "\n" + "First Name: Rahul"+ "\n" + "Last Name: Verma" + "\n" + "Mobile: 9958509094" + "\n" + "BirthPlace: Meerut");
	 }
	
		
	public static void main(String[] args) {
		TeamInfo t =new TeamInfo();
		t.option();
	}

}
