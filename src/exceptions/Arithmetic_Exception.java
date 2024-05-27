package exceptions;

public class Arithmetic_Exception {
	
	public static double divide(double x, double y) {
		if(y > 0) {
			return x / y;
		} else {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(divide(4, 0));
		} catch (ArithmeticException e) {
			System.out.println("No division with 0");
		}
		
	}

}
