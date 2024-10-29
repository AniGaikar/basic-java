package e12;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//raw type means can store any type of data
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(1);
		ar.add(2);
		System.out.println(ar.size());
		
		ar.add(3);
		ar.add(4);
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
//		System.out.println(ar.get(5));//indexoutboundExpection
//		System.out.println(ar.get(-1));//indexoutofBound
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("run"); 
		
		//what is load factor
		// how many virtual factor you can create(i.e. physical capicty/2)
		
		//Generic in arraylist
		
		ArrayList <Integer> markList = new ArrayList <Integer>();//vc=0,pc=0
		markList.add(100);
		markList.add(200);
		
		ArrayList <Double> bmiIndex = new ArrayList <Double>();
		bmiIndex.add(12.33);
		bmiIndex.add(100.100);
		
		ArrayList <String> browserList = new ArrayList <String> ();
		browserList.add("chrome");
		browserList.add("Firefox");
		browserList.add("IE");
		browserList.add("safari");
		
		System.out.println(browserList.size());
		System.out.println(browserList.get(3));
		
		System.out.println("==============================");
		System.out.println(browserList);
		
		for(int i =0;i<browserList.size();i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("IE")) {
				System.out.println("microsoft");
			}
			
			System.out.println("--------------");
			
			//for each
			
			for(String e:browserList) {
				System.out.println(e);
			}
		}
		
		//how to store a data in dynamic array
		ArrayList <Object> empList = new ArrayList <Object> ();
		empList.add("Anirudh");		
		empList.add("Gaikar");
		empList.add(30);
		empList.add('m');
		empList.add(true);
		System.out.println(empList.size());
		
		System.out.println(empList.get(1));
		
		System.out.println("===============");
		
		for(Object r :empList) {
			System.out.println(r);
		}
		
		//use case
		//forms
		//ubers:carlist
		//amazon:productlist
		//total link--> linklist
		//total image--> linklsit
		
		//in arrylist we can't primitive datatype
		
		
	}

}
