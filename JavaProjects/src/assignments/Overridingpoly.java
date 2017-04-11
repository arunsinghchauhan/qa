package assignments;

public class Overridingpoly {

	public void m11()
	{
		System.out.println("method of parent class");
	}
	
	
public static void main(String[] args) {
//	Overridingpoly ov=new Overridingpoly();
//	ov.m11();
//=====================	
	
//	Subclass su= new Subclass();
//	su.m11();
//=====================

Overridingpoly ref= new Subclass();
ref.m11();

Subclass s= new Overridingpoly();

	
	
	
	}
}
	class Subclass extends Overridingpoly
{
		
		public void m11()
		{
			System.out.println("method of sub class");
		}
	

}
