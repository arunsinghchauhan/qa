package assignments;

public class TestInherit {

	void m1()
	{
		System.out.println("method 1");
	}
	
//    void m1()
//    {
//    	System.out.println("2nd method");
//    }
}

class derived extends TestInherit{
	void m1()
	{
		System.out.println("method 2");
	}
}