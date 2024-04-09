package stack_exercises;

import java.util.LinkedList;

public class Exercise_1 {
	
	
	public static String reverseString(String input) {
		
		LinkedList<Character> list = new LinkedList<Character>();
		char[] reverseList = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			list.push(input.charAt(i));
		}
		
		for(int i = 0; i < input.length(); i++) {
			reverseList[i] = list.pop();
		}
		
		return String.valueOf(reverseList);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Moin"));
		
	}

}
