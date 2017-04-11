package assignments;

public class StaticCheck {

	int x=10;
	static int y=10;
	
	public void increment()
	{
		x++;
		y++;
	}
	
	void print()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		StaticCheck sc= new StaticCheck();
		StaticCheck sc1= new StaticCheck();
		StaticCheck sc2= new StaticCheck();
		sc.increment();
		sc.print();
		sc1.increment();
		sc.print();
		sc2.increment();
		sc.print();

	}

}
