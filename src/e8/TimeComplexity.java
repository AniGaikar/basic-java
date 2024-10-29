package e8;

import java.util.Iterator;

public class TimeComplexity {

	public static void main(String[] args) {
		
		
		int i=10;
		System.out.println(i);
		
		//Constant time:big0(1)
		String name = "tom";
		System.out.println(name);//0(1)
		
		int n=10;
		for (n = 1;  n<=n; n++) {
			System.out.println(n);
			
		}
   //1+n+n+n ===> 3n+1---> linear equation
// 3n+1--->3n--0(n)
	}

}
