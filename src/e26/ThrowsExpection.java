package e26;

public class ThrowsExpection {
	
	public void m1() throws ArithmeticException{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("m2 method");
		int i=9/0;
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowsExpection tt = new ThrowsExpection();
		tt.m1();
		
		System.out.println("bye");

	}

}
