package exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Noten {

	private static final Pattern notes = Pattern.compile(
			"C,?|D,?|E,?|F,?|G,?|A,?|B,?|c'?|d'?|e'?|f'?|g'?|a'?|b'?");
	
	public static void notesFromFile(String inputFile, String outputFile) {
		
		try {
			Scanner sc = new Scanner(Paths.get(inputFile));
			PrintWriter pw = new PrintWriter(outputFile);
			
			pw.write("M : C\n");
			pw.write("L : 1/4\n");
			pw.write("K : C\n");
			
			while(sc.hasNextLine()) {
				String note = sc.nextLine();
				if(notes.matcher(note).matches()) {
					pw.write(note + " ");
				}
			}
			
			pw.close();
			sc.close();
			
		} catch (IOException e) {	
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		
		notesFromFile("notes.txt", "finalNotes.txt");
		
	}

}
