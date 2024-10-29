package e10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//limition of array 
		
		int a[] = new int [4];//this how we delecre a array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[2]);
		
//		how to measure the length of array
		int len =a.length;
		System.out.println(len);
//		
		//how to mesure index of it
		int hi =len-1;
		System.out.println(hi);
//		
		//how to print lowest index
		int li=0;
		 System.out.println(li);
		
		
		// to print all the value of array
		
		for(int i=0;i<a.length;i++) //i take value if whole array{
			{System.out.print(a[i]);
		} 
		
		//without using for loop
		System.out.println(a);// give us memory address
		System.out.println(Arrays.toString(a));
		
		//double array
		double d[] =new double[2];
		d[0]=12.33;
		d[1]=34.44;
		System.out.println(d[0]+d[1]);
		
		//string arrray
		String emp[] = new String[3];
		emp[0]="jig";
		emp[1]="Ani";	
		emp[2]="Vai";
		
		System.out.println(Arrays.toString(emp));//how to print compelete araay
		for(int e=0;e<emp.length-1;e++) {
			System.out.println(emp[e]);
			if(emp[e].equals("Ani")) {
				System.out.println("Ani salary is: "+ 75000);
				break;
			}
		}
		
		System.out.println("total emp:" + emp.length);
	}
}
