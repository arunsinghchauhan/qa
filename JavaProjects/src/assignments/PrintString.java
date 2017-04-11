package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintString {

	
	public static void main(String[] args) {
	
	ArrayList<employee> al = new ArrayList<employee>();
	employee e1 = new employee("Rahul");
	employee e2 = new employee("Arun", 3619);
	employee e3 = new employee("Brijesh", 3430);
	e1.emp_id = 1576;
	employee.Company = "QAInfotech";
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	for(employee e:al)
	{
	System.out.println(e.name);
	}
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.);	
	}
	}

}
