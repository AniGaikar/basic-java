package e14;

public class JavaMemoryAllocation {
	
	String name;
	int age;
	double pay;
	boolean isempo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JavaMemoryAllocation c1 = new JavaMemoryAllocation();
		//in   the new JavaMemoryAllocation is store in heap and c1 is store in stack
		JavaMemoryAllocation c2 = new JavaMemoryAllocation();
		
		new JavaMemoryAllocation();//no refer it will handle by garbage collection
		JavaMemoryAllocation c3; // just a ref without an object,it will remain in stack
		
		JavaMemoryAllocation c4 = new JavaMemoryAllocation();// this is having a null refer
		c4 =null; // this will also handle by garbage collector
		
		//Garbage run with jvm everytime
		
		//how you can call garbage collector
		System.gc();// this does not give guaranty to call garbage collector
		
		
		// this is also a write way to obj refer and object
		JavaMemoryAllocation c8;
		c8 = new JavaMemoryAllocation();

	}

}
