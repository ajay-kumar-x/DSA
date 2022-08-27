package regex;

import java.util.regex.*;
public class Regex {

	public static void main(String[] args) {
	  Pattern pattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]*");  //regex for name having fist and last names first character as Upper Case
	  
	  Matcher matcher = pattern.matcher("Ajay Kumar");
	  
	  boolean matchFound = matcher.find();
	  if(matchFound)
		 System.out.println("Match found");
	  else 
		 System.out.println("Match not found");
		    
}
}
