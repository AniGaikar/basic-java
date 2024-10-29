package e25;

public class SuperCC {
	
	String Name;
	int age;
	boolean gender;
	
	int mage=88;
	
	

	public SuperCC(String name, int age, boolean gender) {
		super();
		System.out.println(name+" "+age+" "+gender);
		this.Name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public SuperCC() {
		System.out.println("Super is calling");
	}



	public SuperCC(String name, boolean gender) {
		Name = name;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("SperCC calling");
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
