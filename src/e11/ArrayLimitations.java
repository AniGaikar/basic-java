package e11;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object is the class in java
		
		//limitations of array
		
		
		Object emp[] = new Object[5];
		
		emp [0]="Tom";
		emp [1]=30;
		emp [2]=23.33;
		emp [3]='m';
		emp [4]=true;
		
		System.out.println(Arrays.toString(emp));
		
		for(int q=0;q<emp.length;q++) {
			System.out.println(emp[q]);
		}
		
		//static array ex
		//1.bookmyshow
		//2.filght booking
		

	}

}
