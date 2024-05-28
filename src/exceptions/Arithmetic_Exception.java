package exceptions;

public class Arithmetic_Exception {
	
	public static double divide(double x, double y) {
		if(y > 0) {
			return x / y;
		} else {
			throw new ArithmeticException();
		}
	}
	
	public static int checkFileExtension(String file) {
		
		if(file.endsWith(".java")){
			System.out.println("1");
			return 1;
		} 
		try {
			if (file.isEmpty()) {
				throw new FileIsEmptyException();
			}
				
		} catch (FileIsEmptyException e) {
			System.out.println("File ist leer!");
			return -1;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(divide(4, 0));
		} catch (ArithmeticException e) {
			System.out.println("No division with 0");
		}
		
		checkFileExtension("text.java");
		
	}

}
