package assignments;

import java.util.Scanner;

public class PrimeSeries {
 int n;
	
 public void inputnum()
	   {		
	      Scanner read = new Scanner(System.in);
	      System.out.println("Enter the number til where, you want to print prime numbers: ");
	      n=read.nextInt();
	      
	      for(int i=2;i<n;i++)
	      {
	    	  boolean isPrime = true;
	    	
	    	  for(int j=2;j<i;j++)
	    	  {
	    		  if(i%j==0)
	    		  {
	    			  isPrime=false;
	    			  break;
	    		  }
	    	  }
	    	  if(isPrime)
                  System.out.print(i + " ");
	      }
	      
	     
	      
	   }
	 public static void main(String[] args) {
		 PrimeSeries ps= new PrimeSeries();
		 ps.inputnum();
	}
}

