package assignments;

import java.io.File;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException 
	{
//		File f=new File("abc.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());

		File f= new File("arundir");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		
    }

}
