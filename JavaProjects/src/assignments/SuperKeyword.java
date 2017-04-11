package assignments;

public class SuperKeyword {

	int num=100;
	SuperKeyword()
	{
		System.out.println("Cons");
	}
	
}

class Sub extends SuperKeyword
{
	int num=50;
	void display()
	{
		System.out.println(super());// There is no way to invoke parent num variable except super 
	}
}
