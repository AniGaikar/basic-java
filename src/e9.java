
public class e9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// nested loop
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		
		for (int m=0;m<=3;m++) {
			for(int n=0;n<=4;n++) {
				System.out.print(m+""+n+" ");
		}
			System.out.println();

		}
		
		for(int k=0;k<=3;k++) {
//			System.out.println(k);
			for(int l=0;l<=k;l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}