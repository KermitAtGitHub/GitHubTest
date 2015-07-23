package nl.c2c.ac.test.github;


public class GitHub3  {

	private static String context;

	
	public static String getContext() {
		return context;
	}

	public static void setContext(String context) {
		GitHub3.context = context;
		GitHub3.context = context + "extra";
		//added extra extra
		GitHub3.context = context + "extra";
	}
	

}
