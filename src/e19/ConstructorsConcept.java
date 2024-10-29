package e19;

public class ConstructorsConcept {

	String name;
	int age;
	double salary;

	public ConstructorsConcept(String name) {
//		System.out.println(name);
		this.name = name;
	}

	public ConstructorsConcept(String name, int age) {
//		System.out.println(name);
		this.name = name;
		this.age = age;
	}

	public ConstructorsConcept(String name, int age, double salary) {
//		System.out.println(name);
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorsConcept ee = new ConstructorsConcept("nj");
		System.out.println(ee.name);
		System.out.println(ee.age);
		System.out.println(ee.salary);

		ConstructorsConcept aa = new ConstructorsConcept("tj", 44);
		System.out.println(aa.name + " " + aa.age);

		ConstructorsConcept rr = new ConstructorsConcept("mj", 56, 60000.00);
		System.out.println(rr.age + " " + rr.name + " " + rr.salary);

	}

}
