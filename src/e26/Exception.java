package e26;

public class Exception {
	
	public static int div(int a, int b) {
		int z=-1;
		try {
			 z=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("B is zero...so AE is coming");
			e.printStackTrace();
		}
		return z;
	}
	
	public static void main(String[] args) {
		Exception uu = new Exception();
		uu.div(10, 0);
		System.out.println(uu);
	}

}
