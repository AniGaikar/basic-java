package e27;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			throw new Exception("user is not found exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String data = null;
		if (data==null) {
			try {
				throw new Exception("datanotfoundexception");
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			
		}
		try {
			System.out.println(data.length());
		} catch (NullPointerException e) {
			System.out.println("can not calucalte");
		}
		
		System.out.println("bye");
		
		

	}

}
