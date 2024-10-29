package e28;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable vlaue can be never change
		
		String s ="Selenium";
		String t=s+"heelo";
		System.out.println(t);
		System.out.println(s);
		
		String st="java";
		System.out.println(st+"pytonn");
		System.out.println(st);
		
		st=st+"automation";
		System.out.println(st);
		
		String u ="java";
		
		System.out.println(u);
		
		//Stringbuidler is class its alway written with
		//StringBuilder sb = new StringBuilder("test");	
		
		//stringbuilder and stringbuffer are mutable value can be changed
		//append maen concatenation
		// when we want to change the value we use stringbuilder
		
		StringBuilder sb= new StringBuilder("Testing");
		System.out.println(sb);
		sb.append("Automation");
		System.out.println(sb);
				

	}

}
