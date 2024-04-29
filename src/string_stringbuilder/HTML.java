package string_stringbuilder;

public class HTML {
	
	public static StringBuilder htmlElement(String tag, String body) {
		
		StringBuilder str = new StringBuilder();
		
		if(tag == null || tag == "") {
			return str.append(body);
		} else if(body == null) {
			 return str.append("<" + tag + "></" + tag + ">");
		} else {
			 return str.append("<" + tag + ">" + body + "</" + tag + ">");
		}
		
	}
	
	public static StringBuilder strong(String body) {
		return htmlElement("strong", body);
		
	}
	
	public static StringBuilder emphasized(String body) {
		return htmlElement("em", body);
	}
	
	public static void main(String[] args) {
		
		System.out.println(strong(emphasized( "strong is bold").toString()));
		
		
	}

}
