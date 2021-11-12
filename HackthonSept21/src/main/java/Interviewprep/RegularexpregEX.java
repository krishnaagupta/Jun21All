package Interviewprep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Java does not have a built-in Regular Expression class,
but we can import the java.util.regex package to work with 
regular expressions. The package includes the following classes:
1.Matcher Result interface
2.Pattern Class - Defines a pattern (to be used in a search)
3.Matcher Class - Used to search for the pattern
4.PatternSyntaxException Class - Indicates syntax error in a regular 
expression pattern*/
//example :Find out if there are any occurrences of the word "w3schools" in a sentence:
public class RegularexpregEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*the pattern is created using the Pattern.compile() method. 
		 * The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.


The matcher() method is used to search for the pattern in
a string. It returns a Matcher object which contains information 
about the search that was performed.

The find() method returns true if the pattern was found in 
the string and false if it was not found.*/
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		boolean matchFound = matcher.find();
		if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }

	}

}
