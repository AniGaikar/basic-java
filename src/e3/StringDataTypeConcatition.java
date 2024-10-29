package e3;

public class StringDataTypeConcatition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b =20;
		
		System.out.println(a+b);
		
		String x ="hello";
		String y ="sugar";
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(a+b+x+y);//30hellosugar
		System.out.println(x+y+a+b);//hellosugar1020
		System.out.println(x+y+(a+b));//hellosugar30
		
		System.out.println(a+b+x+y+a+b);//30hellosugar1020
		System.out.println(a+b+x+y+(a+b));//30hellosugar30
		
		double c =12.33;
		double d =23.44;
		
		System.out.println(a+b+c+d);
		
		char t1 ='a';//ascii value of a is 97
		char t2 ='b';
		
		System.out.println(t1+t2);
		System.out.println('a');//will just print a as it get as string
		System.out.println('a'+'b');
		
		//ASCII key will work for all programming code
		//a-b Value :97-122
		//A-B value :65-90
		//0-9 value :48-57
		
		//how to print ascii value
		System.out.println((byte)'a');
		System.out.println((int)'a');
		System.out.println(4/2);
		System.out.println(9/2);//as the both number are integer so answer is 4
		System.out.println(9.0/2);//4.5
		System.out.println((double)9/2);// as in this we ask no to double
		System.out.println((float)9/2);
//		System.out.println(9/0);
//		System.out.println(0/0);
		System.out.println(0/9);
		System.out.println(9.0/0);
		System.out.println((double)9.0/0.0);
		System.out.println(0.0/0.0);// its not a number NaN
		System.out.println('a'/2);
		System.out.println(9%3);
		System.out.println(9%2);

	}

}
