package assignments;

import java.util.Scanner;

public class DuplicateNumber {
int n,count;
int array1[];
int array2[];
int f;
int aWhile, counter =0;
Scanner read= new Scanner(System.in);
	
public void inputnumber()
	{
	System.out.println("Enter the count of numbers you want to entered: ");
	count=read.nextInt();

	array1 = new int[count];
	System.out.println("Enter the numbers :");
	for(int x=0;x<array1.length;x++)
    {
        array1[x]=read.nextInt();
    }
	
	}

public void print()
{
	for(int i=0;i<array1.length;i++)
	{
		System.out.println(array1[i]);
	}
}

	public void dups()
	{
		for(int i =0;i<array1.length;i++)
		{
			for(int j =i+1; j<array1.length;j++)
				{
					if(array1[i]==array1[j])
						{
						f = array1[i];
						}
		
				}
		}
		System.out.println(f);
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]==f)
			{
				counter++;
			}
		}
		System.out.println(counter);
		
	}
	
	public static void main(String[] args) {
		DuplicateNumber dn= new DuplicateNumber();
		dn.inputnumber();
        dn.dups();
		//dn.print();
	}

}
