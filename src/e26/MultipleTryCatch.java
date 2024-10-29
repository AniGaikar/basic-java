package e26;

public class MultipleTryCatch {
	int age;

	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("-----------------");
		
		try {
			MultipleTryCatch obj = new MultipleTryCatch();
			obj=null;
			obj.age=20;
			
			int i=9/3;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		System.out.println("bye");
	}

}
