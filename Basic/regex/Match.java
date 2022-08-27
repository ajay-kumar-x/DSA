package regex;

import java.util.regex.*;
public class Match {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\d{3}");
		Matcher matcher=pattern.matcher("121453");
		int i=0;
		while(matcher.find()) {
			i++;
			  System.out.println("match"+i+":"+ matcher.group(0));
	            
		}
		if(i==0)
			System.out.println("No match found");

	}

}
