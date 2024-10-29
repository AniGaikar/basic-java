package e21;

public class Tata extends Cars {
	
	
	//Method overriding:ploy +morphism--->run time(dynamic)
	//When you have a method in parent class and the same method in child class
	//with the same name
	//with same number of parameter
	//with the same sequence of parameter
	//with the same return
	
	@Override
	public void start() {
		System.out.println("Tata----start");
	}
	
	public void start(int i) {
		System.out.println("Tata----start");
	}//for method with parameter, sequences of parameter should be same
//	@Override
//	public void start(String o,int i) {
//		System.out.println("car----start");
//	}//override wont work on parameter with different sqeunes
	
	public void type() {
		System.out.println("Tata-----Commerical");
	}
	
	public void autopark() {
		System.out.println("Tata----Autopark");
	}
	
	@Override
	public void pertrolEngine() {
		System.out.println("Tata----pertrolEngine");
	}
	
	

}
