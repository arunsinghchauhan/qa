package assignments;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IoFileExample{

	public static void main(String[] args) 
			throws IOException {
		
		String content;
			//File f=new File("abc.txt");
			//System.out.println(f.exists());
			//f.createNewFile();
			//System.out.println(f.exists());
			
//			if(content.matches(".*\\d.*")) {
//			System.out.println("contains a number");	
//		static void validate(String content)throws InvalidAgeException{  
//		     if(age<18)  
//		      throw new InvalidAgeException("not valid");  
//		     else  
//		      System.out.println("welcome to vote");  
//		   }  
		     
			content = new String(Files.readAllBytes(Paths.get("C:\\Users\\arunsinghchauhan\\git\\qa\\JavaProjects\\abc.txt")));
            
           
		    }
			
//			File f= new File("arundir");
//			System.out.println(f.exists());
//			f.mkdir();
//			System.out.println(f.exists());
			
			
	    }



