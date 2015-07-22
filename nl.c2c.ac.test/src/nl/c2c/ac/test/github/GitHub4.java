package nl.c2c.ac.test.github;


/**
 * @author Ronald2
 *
 */
public class GitHub4  {

	private static String context;

	
	public static String getContext() {
		return context;
	}

	public static void setContext(String context) {
		GitHub4.context = context;
		//add extra text here
	}
	
	public static void setContext(String context, String extra) {
		GitHub4.context = context + extra;
	}
	
}
