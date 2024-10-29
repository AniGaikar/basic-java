package e15;

public class MethodInJava {
	
	//method--class data member
	
	
	//1.no input no retrune
	//void no return--function can not return anything
	//rutrun type is void
	public void test() {
//		System.out.println("test method");
		int i=20;
		System.out.println((i));
		
		// this program will not run because in java eveything need to define in main method
		//so for that we need to create object in ,menthod to call this method
	}
	//2. no input but some retrun
	//rutrun type is int
	public int totalAmount() {
//		System.out.println("total amount");
		int i =10;
		int tax =5;
		int finalpayment= i+tax;
		return finalpayment;
		
		// void and return can be together
	}
	
	public String trainerName(){
		System.out.println("trainer name");
		String name = "ag";
		return name;
	}
	
	public  char gender() {
		System.out.println("get gender");
		char p = 'f';
		return p;
//		return 'r'; you can use this to
	}
	
	public int add(int a,int b) {//method parameter
		System.out.println("adding two number");
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		//method cannot be in another method
		
		MethodInJava obj = new MethodInJava();
		obj.test();//calling a mehod
//		obj.totalAmount();
		
		// how to return the value in method(i.e. finalamount)
		
		int val = obj.totalAmount();
		System.out.println(val);
		
//		obj.trainerNamr();
		
		String a = obj.trainerName();
		System.out.println(a);
		
//		System.out.println(obj.gender());
		char aa = obj.gender();
		System.out.println(aa);
		
		int ss = obj.add(10, 20);//arugment --> value
		System.out.println(ss);
 
	}

}
