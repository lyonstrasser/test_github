package string_stringbuilder;
import java.util.LinkedList;

public class SumOfTheDigits {
	
	 
		public static int digitSum(String value) {
			LinkedList<Integer> stack = new LinkedList<>();
			for (String s : value.split("")) {
				stack.push(Integer.parseInt(s));
			}
			while (!(stack.size() == 1)) {
				int num1 = stack.pop();
				int num2 = stack.pop();
				int result = num1 + num2;
				stack.push(result);
			}
			return stack.pop();
		}
		
	
	
	
	public static void main(String[] args) {
		
		System.out.println(digitSum("10"));
 
		
	}

}
