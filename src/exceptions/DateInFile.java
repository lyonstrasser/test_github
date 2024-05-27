package exceptions;

import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DateInFile {

	public static void main(String[] args) {

		String file = "test.txt";
		
		try(PrintWriter writer = new PrintWriter(file)){
			writer.write(LocalDateTime.now().toString());
			System.out.println("Erfolgreich �berschrieben!");
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}

}
