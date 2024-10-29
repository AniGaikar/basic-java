package e20;

public class TestingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass tt = new PrivateClass();
		
		Encapsulation ee = new Encapsulation("Kolose", "India", "Bharat", "+91");
		
		System.out.println(ee.getCity());
		
		ee.setCity("Mahad");
		ee.setCountry("India");
		ee.setCode("+91");
		ee.setName("tj");
		
		System.out.println(ee.getCity()+" "+ee.getCountry()+" "+ee.getName()+" "+ee.getCode());
		

	}

}
