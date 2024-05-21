package rekursion;

public class Binomialkoeffizient {
	
	public static int calculateBinomialkoeffizient(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		} else {
			return calculateBinomialkoeffizient(n-1, k-1) + calculateBinomialkoeffizient(n-1, k);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateBinomialkoeffizient(4, 2));
		
	}

}
