package session.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private static final String regex = "^(.+)@(.+)$";

	public static void main(String args[]) {
		List<String> emails = new ArrayList<String>();
		// valid email addresses
		emails.add("sbhushan1305@gmail.com");
		emails.add("shashi.bhushan1305@example.co.in");
		emails.add("bhushan@shashi1305.me.org");
		// invalid email addresses
		emails.add("ssbhushan1305.gmail.com");
		emails.add("bhushan#shashi.com");
		emails.add("bhushan.me.org");

		// initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);

		// searching for occurrences of regex
		for (String value : emails) {
			Matcher matcher = pattern.matcher(value);

			System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
		}System.out.println("\n*********Programmed by S.Bhushan*********");
	}
}