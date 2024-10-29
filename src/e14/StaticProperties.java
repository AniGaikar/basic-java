package e14;

public class StaticProperties {
	
	//static is only for class;you cant write in main method
	
	String name;
	String color;
	int Price;
//	static int wheels =4;
	static final int wheels =4;//user willnot able to change date
	//static is common prop for all the object
	//but obj will not hold the static property
	//static variable will stored in Common memory allocation
	//and it will create only one copy for all the object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticProperties c1 = new StaticProperties();
		c1.name = "Bmw";
		c1.color = "white";
		c1.Price = 80;
//		c1.wheels=4;// this is not a right way to access the static data
		
		//how to acccess static var
		//using the class name
//		StaticProperties.wheels=5; // your able to manipulte in static value so it not a good particle
		
		System.out.println(c1.name+" "+ c1.color+ " "+ c1.Price+" "+ c1.wheels);
		
		//you can static data directly
		System.out.println(wheels);
		
		//but when you want non-golbal variable directly it will not work
		
		StaticProperties c2 = new StaticProperties();
		c2.name = "tata";
		c2.color = "orange";
		c2.Price = 40;
//		c2.wheels=4; // not allow due memory allocation
		
		StaticProperties c3 = new StaticProperties();
		c3.name = "kia";
		c3.color = "red";
		c3.Price = 60;
//		c3.wheels=4;

	}

}
