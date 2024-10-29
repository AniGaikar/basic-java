package e10;

import java.util.Arrays;

public class ArrayLiteralConcept {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
//		int b[] = new int[5];// we write this when do not aware of data
	System.out.println(a.length);
	System.out.println(Arrays.toString(a));
	
	double d[] = {1.1,2.2,3.3,4.4,5.5};
	char vowels[]= {'a','e','i','o','u'};
	
	String browser[] = {"Chrome","FireFox","IE","Safari"};
	for(int k=0;k<browser.length;k++) {
		System.out.println(browser[k]);
		
		if(browser[k].equals("IE")) {
			System.out.println("You selected"+" "+ "IE");
		}
	}
	
	}

}
