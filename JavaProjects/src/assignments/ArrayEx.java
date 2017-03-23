package assignments;

public class ArrayEx {

	
//	void array()
//	{
//		String arr[];
//		arr=new String[5];
//		
//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(arr);
//		}
//	}
	
	void sum()
	{
		int arr[]={12,22,32};
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("The array element is: "+arr[i]);
		}
	}
	
//	void test()
//	{
//		int t[]= new int[5];
//		t[0]=1;
//		t[1]=4;
//		t[2]=7;
//		t[3]=10;
//		t[4]=3;
//		//t[5]=67;
//		for(int i=0;i<t.length;i++)
//		{
//		System.out.println("The array t have these elements: "+t[i]);
//		}
//		
//	}
	
	public static void main(String[] args) {
		ArrayEx a= new ArrayEx();
		//a.array();
		a.sum();
		//a.test();
		
		
	}

}
