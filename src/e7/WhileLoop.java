package e7;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while (i<=9) {
			System.out.println(i);
			i++;
		}
		
		int k=1;
		
		while (true) {
			System.out.println("wlecom to my world");
		if (k==5) {
			break;
		}
		k++;

		}
		
		//for loop
		//for(initialize,condition,increment/decrement)
		
		int j = 1;
		for(j=1;j<=10;j++) {
			System.out.println(j);
		}
         int p =1;
         for (p=1;p<=5;p++){
        	 System.out.println(p);
         }
         
         for(char ch='a';ch<='z';++ch) {
        	 System.out.print(ch); //we use print to print in line
         }
         
         for (char cc='A';cc<='Z';++cc) {
        	 System.out.println((byte)cc);
         }
         
         for (int r=1;r<=100;++r) {
        	 System.out.println("anirudha");
         }
         int o=1;
         while(true) {
        	 System.out.println(o + "nimish");
        	 if(o==100) {
				break;
        	 }
             ++o;
         }
	}

}
