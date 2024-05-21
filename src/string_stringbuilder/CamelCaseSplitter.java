package string_stringbuilder;


public class CamelCaseSplitter {
	
	
	public static StringBuilder camelCaseSplitter(String word) {
		
		StringBuilder str = new StringBuilder();
		
		for(char c : word.toCharArray()) {
			str.append(c);
			if(Character.isUpperCase(c)) {
				str.append(" ");
				return str;
			}
		}
		return str;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(camelCaseSplitter("halloMario"));
		
	}

}
