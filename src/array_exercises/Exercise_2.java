package array_exercises;

public class Exercise_2 {
	
	
	public static boolean isProbablyApproaching(String[] signs) {
		for(int i = 0; i < signs.length; i++) {
			if(signs.length == 0 || signs[i].equals(null)) {
				System.out.println("Fehler!");
				return false;
			}
			else if(signs[i].equals(signs[i-1]) && signs[i].equals(signs[i-2]) && signs[i].equals(signs[i-3])){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
