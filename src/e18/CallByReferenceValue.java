package e18;

public class CallByReferenceValue {
	
	String name;
	int age;
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void printmesg() {
		System.out.println("hello");
	}
	
	public void getempinfo(CallByReferenceValue ll) {
		
		ll.name="joker";
		ll.age=22;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByReferenceValue jj = new CallByReferenceValue();
		jj.add(22, 22);//call by value/argument
		
		
		
		
		System.out.println(jj.name);
		System.out.println(jj.age);
//		
		jj.getempinfo(jj);//call by reference
		jj.name="bat";
		jj.age=02;
		
		
		System.out.println(jj.name);
		System.out.println(jj.age);
		
		jj.getempinfo(jj);
	}

}
