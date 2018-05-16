package assignments;
// we have to count max number of continuous 1's.
public class Test {
	int count=0, max=0;
	
	int arr[]={1,1,1,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1};
	void m()
	{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==1)
		{
			count=count+1;
			if(count>max)
			 max=count;
		}
		else{
			
			count=0;
		}
	}
	System.out.println("max number of continuous 1's "+max);
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.m();
	}
}
