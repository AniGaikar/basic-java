package e26;

public class Throws {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		
		try {
		m3();
		}catch(ArithmeticException e) {
			System.out.println(" Its an AE exception");
			e.printStackTrace();
		}
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		int i=9/0;
	}

	
	// one should never use throws in method
	//for clearly of code one should be write method that is throw exception with throw keyWords
	//for correct handle it should be always use try and catch block
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Throws tt = new Throws();
		tt.m1();
		
		System.out.println("bye");

	}

}
