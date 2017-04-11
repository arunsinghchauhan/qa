package assignments;

import java.util.Scanner;

public class ResourceMgmt {

	int id;
	long mobno;
	String firstname, lastname, birthplace;
	Scanner read = new Scanner(System.in);

	ResourceMgmt(int id, long mobno, String firstname, String lastname, String birthplace) {
		this.id = id;
		this.mobno = mobno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthplace = birthplace;

		

	}
	ResourceMgmt()
	{}
	
	public void display_info()
	{
		System.out.println(id + " " + mobno + " " + firstname + " " + lastname + " " + " " + birthplace);
	}


	
	
	public static void main(String[] args) {

		ResourceMgmt arun = new ResourceMgmt(3619, 9971070638L, "Arun", "Chauhan", "Aligarh");
		ResourceMgmt rahul = new ResourceMgmt(1576, 9958509094L, "Rahul", "Verma", "Meerut");
		ResourceMgmt brijesh = new ResourceMgmt(3430, 9716814644L, "Brijesh", "Yadav", "Banaras");
		ResourceMgmt mayank = new ResourceMgmt(3578, 9610322000L, "Mayank", "Kakkar", "Ganganagar");
		
		
		System.out.println("Hi there, which of the following options do you want to access your information:" + "\n" + "Press 1 for ID, 2 for First Name, 3 for Last name, 4 for Mobile number and 5 for Birth Place");
		Scanner read = new Scanner(System.in);
		int option=read.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter your ID: ");
			int ID =read.nextInt();
			switch (ID) {
			case 1576:
				rahul.display_info();
				break;
			case 3619:
				arun.display_info();
				break;
			case 3430:
				brijesh.display_info();
				break;
			case 3578:
				mayank.display_info();
				break;
			default:System.out.println(" ID not exist");
				break;
			}
			break;
		case 2:
			System.out.println("Enter your first name: ");
			String FN= read.next();
			switch (FN.toLowerCase()) {
			case "arun":
				arun.display_info();
				break;
			case "rahul":
				rahul.display_info();
				break;
			case "brijesh":
				brijesh.display_info();
				break;
			case "mayank":
				mayank.display_info();
				break;

			default:System.out.println("First name does not exist");
				break;
			}
			break;
			
		case 3:
			System.out.println("Enter your last name: ");
			String LN= read.next();
			switch (LN.toLowerCase()) {
			case "chauhan":
				arun.display_info();
				break;
			case "verma":
				rahul.display_info();
				break;
			case "yadav":
				brijesh.display_info();
				break;
			case "kakkar":
				mayank.display_info();
				break;

			default:System.out.println("Last name does not exist");
				break;
			}
			break;
			
		case 4:
			System.out.println("Enter your Mobile Number: ");
			String MN =read.next();
			switch (MN) {
			case "9958509094":
				rahul.display_info();
				break;
			case "9971070638":
				arun.display_info();
				break;
			case "9716814644":
				brijesh.display_info();
				break;
			case "9610322000":
				mayank.display_info();
				break;
			default:System.out.println(" Mobile number does not exist");
				break;
			}
			break;
		case 5:
			System.out.println("Enter your Birth Place: ");
			String BP= read.next();
			switch (BP.toLowerCase()) {
			case "aligarh":
				arun.display_info();
				break;
			case "meerut":
				rahul.display_info();
				break;
			case "banaras":
				brijesh.display_info();
				break;
			case "ganganagar":
				mayank.display_info();
				break;

			default:System.out.println("Birth Place does not exist");
				break;
			}
			break;
		default:System.out.println("Option does not exist");
		
		}
		

	}

}
