package e27;

public class Student {

	public static int getMarks(String name) {
		System.out.println("getting mark of"+ name);
		
		if (name.equals("Tj")) {
			
			try {
				int i=9/0;
				return 95;
			} catch (ArithmeticException e) {
				System.out.println("AE is Coming");
			return 85;
			}
			finally {
				System.out.println("error has arrive");
				return 50;
			}
			//finally block always override catch block
		} else if(name.equals("nj")){
			return 90;
		} 
		else if(name.equals("mj")){
			return 80;
		}
		else {
			System.out.println("Student not found");
			throw new MyException("studentnotfoundexception");
		}
		}
	public static void main(String[] args) {
		int m=getMarks("Tj");
		System.out.println(m);
	}

}
