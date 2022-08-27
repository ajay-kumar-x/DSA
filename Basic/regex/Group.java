package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {

	 public static void main(String[] args) {
	         String regex = "([a-z]+)@(\\d+)-(\\d+)";
	         String string = "ajay@7319-21";
	        
	         Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
	         Matcher matcher = pattern.matcher(string);
	        
	        while (matcher.find()) {
	            System.out.println("Full match: " + matcher.group(0));
	            
	            for (int i = 1; i <= matcher.groupCount(); i++) {
	                System.out.println("Group " + i + ": " + matcher.group(i));
	            }
	        }
	    }
}
