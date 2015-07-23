package nl.c2c.ac.test.github;


/**
 * @author Ronald2
 * added comment in testFeatureLocal
 *added local uppdate but in 2 to create a conflict
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
