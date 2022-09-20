package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		
		String pattern = "(0/91)?[7-9][0-9]{9}";
		
		String input = "348234789";
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher matcher = p.matcher(input);
		
		System.out.println(matcher.find());
	}
}
