package rekursion;

public class SumOfNaturalLetters {
	
	public static int sumOfNaturalLetters(int n) {
		if(n == 0) {
			return n;
		} else {
			return n + sumOfNaturalLetters(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sumOfNaturalLetters(100));
		
	}

}