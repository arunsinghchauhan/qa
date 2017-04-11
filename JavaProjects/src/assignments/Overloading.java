package assignments;

public class Overloading {

//	void school(String schoolname,String address)
//	{
//		System.out.println("Your schoolname is Kendriya Vidyalaya and address is Kamla Nehru Nagar Ghaziabad");
//		
//	}
//	
//	void school(int rollnumber)
//	{
//		System.out.println("your roll number is: "+1024010023);
//	}
//	
	public double Mymethod(double n1, double n2)
	{
		System.out.println("My first method of class demo ");
		return n1+n2;
	}
	public int Mymethod(int n1, int n2)
	{
		System.out.println("My second method of class demo ");
		return n1+n2;
	}
	
	public static void main(String args[])
	{
		Overloading o= new Overloading();
//		o.school(123);
//		o.school("dcdc","sdfwef");
		//System.out.println(o.Mymethod(1.2, 2.2));
		o.Mymethod(1, 2);
		
	}
	
	
	
}

