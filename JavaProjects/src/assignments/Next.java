package assignments;
import java.util.*;
public class Next {

	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(34);
		
		System.out.println("Your list:"+al);
		
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext())

		{
			System.out.println(itr.next());
		}
	}

}
