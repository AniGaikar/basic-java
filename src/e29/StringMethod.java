package e29;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="This is my java iCode";
		
		int len =s.length();
		System.out.println(len);
		
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		System.out.println(s.indexOf('j'));
		System.err.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing"));
		
		String date ="11/11/1111";
		String newDate=date.replaceAll("/", "-");
		System.out.println(newDate);
		
		String browser ="chrome";
		if(browser.trim().equalsIgnoreCase(browser));{
		System.out.println("pass");
		}
		
		String lang ="java_python_dotnet_ruby";
		String l[]=lang.split("_");
		System.out.println(l[0]);
		
		System.out.println(Arrays.asList(l));
		
		String pop ="xxSeliumxxjavaxxJsxx";
		String d[]=pop.split("xx");
		System.out.println(d[0]);
		
		System.out.println(Arrays.asList(d));
		
		String x="100";
		System.out.println(x+20);
		
		//string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		int number = 123;

        // Using String.valueOf(int) method
        String str1 = String.valueOf(number);
        System.out.println("Using String.valueOf: " + str1);
		
	}

}
