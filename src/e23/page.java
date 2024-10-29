package e23;

public abstract class page {
	
	public page() {
		System.out.println("pages-------");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void calculatePageTime() {
		System.out.println("page time out---10 sec");

	}
	
	public final void displaylogo() {
		System.out.println("dipaly logo1");
	}
	
	public static void footer() {
		System.out.println("page footer");
	}

	

}
