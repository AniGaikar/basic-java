package e17;

public class StaticMethodOverLoading {
	
	public static void name() {
		
	}
	
	public static void name(int a) {
		
	}
	
	public static void name(int a, String bb) {
		
	}

	public static void main(String anirudha) {
//		Methods are stored in the Metaspace in modern JVMs.
//		The main method can be overloaded, but the JVM only uses the main(String[] args) method to start the program.
//		The JVM specifically requires the main(String[] args) method to start a Java program.
//		You can define a non-static main method, but it won't be used as the entry point by the JVM.
		System.out.println("anirudha");
	}
	
	public static void main() {}
	
	public static void main(String a []) {
		System.out.println("joker"+a);
	}
	public static void main(int a) {

}
	public static void main(double bb) {
		
		

}
}
