package e11;

import java.util.Arrays;

public class LoopWithEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		for(int e:a) {
			System.out.println(e);
		}
		
		System.out.println(a[2]);
		
		String emp[] = new String[5];
		emp[0]= "pooja";
		emp[1]= "ravi";
		emp[2]= "Robin";
		emp[3]= "Vikash";
		emp[4]="Akhil";
		
		for(String e:emp) {
			System.out.println(e);
			if(e.equals("ravi")) {
				System.out.println("he is a devloper");
			}
		}
			
			Object empo[] = new Object[5];
			
			empo [0]="Tom";
			empo [1]=30;
			empo [2]=23.33;
			empo [3]='m';
			empo [4]=true;
			
			System.out.println(Arrays.toString(empo));
			
			for(Object r:empo) {
				System.out.println(r);
			}
			
			int ar [] = new int[4];
			ar[0] = 10;
			ar[1] = 20;
			ar[2] = 30;
			ar[3] = 40;
			
			for (int i=ar.length-1;i>=0;i--) {
				System.out.println(ar[i]);
			}
			
			int row =5;
			
			for(int i=1;i<=row;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			int pr []= new int[4];
			System.out.println(pr[0]);
			
			pr[0]=100;
			System.out.println(pr[0]);
			
			
			//array are acted as data storage
			//collections
			//Index based/order based
			//0-1-2-3-4
			
			for(int o=4;o>=0;o--) {
//				System.out.printl`n(o);
				for(int x=o;x>=0;x--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		

	}

}
