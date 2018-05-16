package assignments;

public class SplitEx {

	public static void main(String[] args) {
		String s1= "Arun Singh Chauhan learn java";
		String arr[];
		arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//System.out.println(arr);
		
	}

}
