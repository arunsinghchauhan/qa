package assignments;

import java.util.*;

public class StudentCollection {

	public static void main(String[] args) {
		//creating user defined class objects
		
		Student s1= new Student(100,"Arun",23);
		Student s2= new Student(121,"Rahul",28);
		
		//creating arraylist
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
	System.out.println(s1.name +" "+ s1.age +" " + s1.rollno);
		
//		 Iterator itr=al.iterator();  
//		  //traversing elements of ArrayList object  
//		  while(itr.hasNext()){  
//		    Student st=(Student)itr.next();  
//		    System.out.println(st.rollno+" "+st.name+" "+st.age); 
		  }
		  
			

	}

}
