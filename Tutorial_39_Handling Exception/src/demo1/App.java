package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			System.out.println("All is Well");
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception Caught");
		}
		
		
	}

}
