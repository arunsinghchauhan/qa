package assignments;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();//creating array list
		
		al.add(123);//adding object in arraylist
		al.add("Rahul Verma");
		al.add("Mayank Kakkar");
		al.add("Brijesh Yadav");
		
		//Traversing list through Iterator
//		Iterator itr= (Iterator) al.iterator();
//		while(((java.util.Iterator<String>) itr).hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		
		
		//By for loop
		for(String obj:al)
		{
			System.out.println(obj);
		}

	}

}
