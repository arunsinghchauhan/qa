package assignments;

public class Consecutive1s {

	
	int[] arr={1,0,0,1,1,1,0,1,1,0,0,1,1,1,1,1,1,1};
	int temp=0,max=0;
	
	public void traversearr()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				temp= temp+1;
				//System.out.println(temp);
				
			}
			else
			{
				if(temp>max)
				{
					max=temp;
				}
				temp=0;
				
			}
		}
		if(temp>max)
		{
			max=temp;
			System.out.println("The maximum number of consecutive 1;s :" +max);
		}
	}
	public static void main(String[] args) {
		Consecutive1s co= new Consecutive1s();
		co.traversearr();
	}

}
