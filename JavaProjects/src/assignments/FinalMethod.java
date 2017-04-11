package assignments;

public class FinalMethod {

	final void test()
	{
		System.out.println("Base class final method");
	}
}

class Child extends FinalMethod
{
	void test1()//cannot be overriden because it is final method.... but it is inherited
	{
		System.out.println("Child class override method");
	}
}