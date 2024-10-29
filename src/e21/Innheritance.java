package e21;

public class Innheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tata T = new Tata();
		T.start();// Overridden
		T.stop();// inherited
		T.reverse();// inherited
		T.autopark();// individual
		T.engine();// inherited
		T.pertrolEngine();// override

		System.out.println("========================");

		Cars c = new Cars();
		c.start();
		c.reverse();
		c.start();
		c.pertrolEngine();// override
		c.engine();// inherited

		System.out.println("===============================================");

		// child class object can be rerfered by parent class ref varible
		// top/up casting
		Cars cc = new Tata();
		cc.start();
		cc.engine();
		cc.stop();
		cc.pertrolEngine();
//		cc.autoparking();//not allowed---ref type check is failed

		// down cast is possible in compile time,but not possible runtime
//		Tata t1 = new Cars();
		// parent class object can be refereed by child class ref variable
		Tata t1 = (Tata) new Cars();

	}

}
