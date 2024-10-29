package e18;

public class StackMemoryStackOverFlow {
	
//	non static---ns--yes (no object)
//	s---static--- yes (no object)
//	ns--- ns--- directly no object
//	s---ns--- need object 
//	stack---lifo
//	quaue--fifo

	
	
	public static void t1() {
		System.out.println("developer");
//		t2();
	}
	
	public static void t2() {
		System.out.println("QA");
		StackMemoryStackOverFlow.t3();
	}
	
	public static void t3() {
		System.out.println("deveops");
		StackMemoryStackOverFlow.t1();
//		m3();
		StackMemoryStackOverFlow oo = new StackMemoryStackOverFlow();
		oo.m3();
	}
	
	public void m1() {
		System.out.println("Anirudha rocks");
		m4();
	}
	
	public void m2() {
		System.out.println("ratna rocks");
		m1();
	}
	
	public void m3() {
		System.out.println("hemant rocks");
		StackMemoryStackOverFlow.t2();
	}
	public void m4() {
	System.out.println("akshay rocks");	
//	m3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackMemoryStackOverFlow gg = new StackMemoryStackOverFlow();
		gg.m2();
		
		//stack is is lifo; last in first out
		//queue fifo; first in  first out
		
		
		
		

	}

}
