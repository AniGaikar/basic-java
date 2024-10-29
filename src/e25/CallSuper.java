package e25;

public class CallSuper extends SuperCC{
	
	int mage = 30;
	
	public void mage() {
		
		System.out.println(mage);
		int dage = super.mage;
		int diff = dage - mage;
		System.out.println(diff);
	}
	
	public CallSuper() {
		super();
		System.out.println("ypo");
	}
	
	@Override
	public void display() {
		System.out.println("CallSperCC calling");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
