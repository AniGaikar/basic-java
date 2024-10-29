package e21;

public class Cars extends Vehicle{
	
	public void start() {
		System.out.println("car----start");
	}
	
//	public void start(int i) {
//		System.out.println("car----start");
//	}
	
//	public void start(int i,String o) {
//		System.out.println("car----start");
//	}
	
	public void stop() {
		System.out.println("car------stop");
	}
	
	public void reverse() {
		System.out.println("car------reverse");
	}
	
	@Override
	public void pertrolEngine() {
		System.out.println("car---pertrol");
	}

}
