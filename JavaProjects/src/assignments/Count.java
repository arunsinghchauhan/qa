package assignments;

public class Count {
// to count the number of continuous a's
		public void continueCount()
		{
			String[] arr={"a","b","c","d","a","a","a","b","b","c","c","b","b","b","b"};
			int  c=0;
			String ch;
			System.out.println("Length of Array --- >> "+arr.length);
			for(int i=1;i<arr.length-1;i++)
			{
				c=0;
				ch=arr[i];
				int j=i-1;
				while(ch.equalsIgnoreCase(arr[j])){
					c++;
					System.out.println("Count for "+arr[j]+" **** "+ ch + " ^^^^^^ "+c);
					j++;
				}
				System.out.println("Count for "+ch + " ^^^^^^ "+c);
				c=0;
					System.out.println("  ELSE BLOCK !!! ");
				
			}
		}
		
			
			
	
	public static void main(String[] args) {
		Count ob= new Count();
		ob.continueCount();

	}

	

}
