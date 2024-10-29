package e22;

public interface MahadMedical extends India{
	
	//in interface verible are static and final by default
	int a = 100;
	
	
	//abstract method
	//no method body
	//only method declaration/method prototype/no
	//can not create the object
	
	public void cardio();
	
	public void daru();
	
	
	// in interface we can write static method
	public static void misal() {
		System.out.println("only karmaar misal");
		
	}
	
	//only in interface we have luxury of using default method deceleration
	default void kes() {
		System.out.println("my school");
	}

}
