package assignments;

public class StaticKeyword {

	String sname;
	int srollno;
	static String collegename="Sunder Deep";
	
	StaticKeyword(String sname,int srollno)
	{
		this.sname=sname;
		this.srollno=srollno;
	}
	
	 void display()
	{
		System.out.println(sname+","+srollno+","+collegename );
	}
	
	static void check()
	{
		System.out.println("Check Static Method");
	}
	
	
}
