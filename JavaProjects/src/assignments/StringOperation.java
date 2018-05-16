package assignments;

public class StringOperation {

	public static void main(String[] args) {
		String str1= "This World is Very Nice";
		String str2= "very nice";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.charAt(4));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.indexOf(' '));
		System.out.println(str1.indexOf('i',12));
		System.out.println(str1.indexOf("Very"));
		
		//converting int to string
		int j=75;
		String val2= String.valueOf(j);
		System.out.println(val2);
		
		//converting string to int
		 String str= "50";
		 int i=Integer.parseInt(str);
		 System.out.println(i);
		 
		 //System.out.println(str1.substring(5,13));
		 
		 //split string
		
		 String arr[]=str1.split("Very");
		 //arr= new String[2];
//		 System.out.println(arr[0]);
//		 System.out.println("==========");
//		 System.out.println(arr[1]);
		 
		 //trim
		 
		 System.out.println(str1.trim());
		 

	}

}
