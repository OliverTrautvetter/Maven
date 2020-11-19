package aufgabe5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author olive
 *
 */
public class Main {
	static String input;

	/**
	 * Returns an String with the input String [] args in upper case. Input must
	 * contain only letters A-Z and a-z, if input is illegal input is null.
	 * 
	 * @param args passed value
	 * @return input to upper case or null if args is illegal
	 */
	public static String InputToUpperCase(String[] args) {
		input = Arrays.deepToString(args);

		Pattern p = Pattern.compile("^[A-Za-z]+$");
		Matcher m = p.matcher(input);

		if (!m.find()) {
			System.err.println("Illegal Input!");
			return null;
		}

		input.toUpperCase();
		return input;
	}

	/**
	 * Set input to InputToUpperCase(args). Print input if input is not null
	 * 
	 * @param args passed value
	 */
	public static void main(String[] args) {

		String input = InputToUpperCase(args);

		if (input != null) {
			System.out.println(input);
		}
	}
}