package e28;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String literals
		String s ="Hello";
		String s1 = "Hello";
		String s2="hello";
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		
		//Stirng object with new keyword
		String st = new String("java");
		String st1 = new String("Hello");
		
		System.out.println(s==st1);
		System.out.println(s.equals(st1));
		
		String test = new String("Selenium");//1---->heap
		test.intern(); //1---scp
		//in this what happen you created a object selemium but then you are using .intern which a object common pool but without any references
//		String a1 = "Selenium";//0
		//but now al and test have same vlaue but the value in coomon will be given to al as noone is access to it.
	}
	

}
