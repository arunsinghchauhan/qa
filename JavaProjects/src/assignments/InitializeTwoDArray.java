package assignments;

import java.util.Scanner;

public class InitializeTwoDArray {

	Scanner read= new Scanner(System.in);
	String twoDArray[][];
	int m,n,i,j;
	String l;
	
//	public void askLength()
//	{
//		System.out.println("Enter the row length of the 2D array: ");
//		m=read.nextInt();
//		System.out.println("Enter the column length of the 2D array: ");
//		n=read.nextInt();
//		System.out.println("The dimension of the array is: "+m*n);
//	}
//	
	void initializeValues()
	{
		System.out.println("Enter the values in the array: ");
		twoDArray=new String[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				twoDArray[i][j]=read.next();
			}
		}
	}
	
	void showValues()
	{
		System.out.println("Your values in the array are: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(twoDArray[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {

		InitializeTwoDArray ia= new InitializeTwoDArray();
		//ia.askLength();
		ia.initializeValues();
		ia.showValues();
	}

}
