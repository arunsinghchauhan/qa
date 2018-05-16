package assignments;

import java.util.Scanner;

public class SortZeroOne {
	
	Scanner read = new Scanner(System.in);
	int n,l,temp;
	int array[];
	void takeArrSize()
	{
		System.out.println("Enter the size of array");
		l=read.nextInt();
		array=new int[l];
	}
	void takeArrNum()
	{
		System.out.println("Enter the numbers of the array: ");
		
		for(int i=0;i<l;i++)
		{
			array[i]=read.nextInt();
		}
		
	}
	
	void sortarr()
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(array[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		SortZeroOne z= new SortZeroOne();
		z.takeArrSize();
		z.takeArrNum();
		z.sortarr();

	}

}
