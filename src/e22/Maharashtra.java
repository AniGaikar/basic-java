package e22;

public class Maharashtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Raigad f = new Raigad();
		f.daru();
		f.Dmart();
		f.mayur();
		f.railway();
		f.niket();
		f.kes();
		System.out.println(f.a);
		System.out.println(MahadMedical.a);
		
		
		
		//top casting this will call abstact of mahad only
		MahadMedical medical = new Raigad();
		medical.cardio();
		medical.daru();
		System.out.println(f.a);

	}

}
