package e17;

public class Ploymorphism {

	public void search() {

	}

	public void search(String prodName) {
		System.err.println(prodName);

	}

	public void search(String Prodname, int price) {
		System.out.println(Prodname + " " + price);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ploy(many)+morphism
		// method overloading :compile time(static binding):compiler has already taken a
		// decision that
		// which method has to be called on the basis of given value.
		// static binding is method overload

//		Method Overloading is when you have multiple methods with the same name but different parameters. The compiler decides which method to call based on the parameters you pass, and this decision is made before the program runs (at compile time), which is why it's called static binding.

		Ploymorphism nn = new Ploymorphism();

		nn.search("kkk");
		nn.search("jj", 110);

	}

}
