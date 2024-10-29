package e17;

public class Browser {
	
	String name;
	static String hq ="mumbai";
	final String cc="powai";
	
	public int getBrowser() {
		System.out.println("get");
		return 100;
	}
	
	public static String getvendor() {
		System.out.println("browser vendor");
		return "mozilla";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser ee =new Browser();
		
		hq="pune";
		Browser.getvendor();
//		Browser.hq="ion";
		
		System.out.println(hq);
		
//		Static properties can store objects, but they're shared across instances.
//		As of Java 8, Metaspace is where class metadata, including static properties, is stored.
//		Accessing static properties using the class name is a best practice, though objects can access them without warnings.
//		Static methods can be overloaded.
//		Metaspace is dynamic, unlike the fixed PermGen space from earlier Java versions.
	
	}
}
