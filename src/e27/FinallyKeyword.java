package e27;

import java.nio.file.spi.FileSystemProvider;

public class FinallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		
		try {
			int i = 9/0;
		} 
//		catch (ArithmeticException e){
//			System.err.println("AE is coming");
//		}
		finally {
			System.out.println("bye--finally block");
		}

	}
	// we cannot have multiple finally block
	// we can have try   finally 
	// we multiple catch block

}
