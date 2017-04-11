package assignments;

public class CheckOverLoad {

	public static void meth1(String s)
	{
		System.out.println("String parameter method");
	}
	public static void meth1(int s)
	{
		System.out.println("Integer parameter method");
	}
	public static void main(String[] args) {
		
		//CheckOverLoad co= new CheckOverLoad();
		meth1(null);

	}

}
