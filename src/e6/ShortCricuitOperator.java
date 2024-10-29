package e6;

public class ShortCricuitOperator {

	public static void main(String[] args) {
		
		int a =900;
		int b =1600;
		int c =300;
		
		//&& operator is a short circuit operator
		
		if(a>b && a>c) // as  the first condition show its comes false so circuit brake and it dosent check condition that is a>c 
			{
			System.out.println("A is greatest");
		}
		else if (b>c) {
			System.out.println("B is greatest");
		}
		else {
            System.out.println("C is greatest");
		}
		
int aa=25;int bb = 78;int cc= 87; int dd= 97;
		
		if(aa>bb && aa>cc) {
			System.out.println("A is thr greatest number in three");
		}
		else if(bb>aa && bb>c){
			System.out.println("b is thr greatest number in three");
		}
		else if (cc>dd && cc>bb) {
			System.out.println("c is thr greatest number in three");
		}
		else {
			System.out.println("d is thr greatest number in three");
		}

		
	}

}
