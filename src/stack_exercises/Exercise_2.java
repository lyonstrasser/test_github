package stack_exercises;

import java.util.LinkedList;

public class Exercise_2 {
	
	
	public static boolean rightBrackets(String input) {
		
		LinkedList<Character> list = new LinkedList<Character>();
		
		for(char c : input.toCharArray()) {
			
			if(c == '(' || c == '{' || c == '[') {
				list.push(c);
			} 
			else if(c == ')' || c == '}' || c == ']') {
				
				if(list.isEmpty()) {
					return false;
				}
				
				char lastOpened = list.peek();
				
				if((c == ')' && lastOpened != '(') ||
						(c == '}' && lastOpened != '{') ||
						(c == ']' && lastOpened != '[')) {
					return false;
				}
				
				list.pop();
				
			}
		}
		return list.isEmpty();
	}
	
	
	public static void main(String[] args) {

		System.out.println(rightBrackets("(hello)"));
		
	}

}
