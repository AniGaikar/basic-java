package e13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> numberList = new ArrayList <Integer> ();
		// the default vc is alway is 10; and we can it by supply vlaue (); 
		//vc 20 pc=0
		//lf=? lf=10
		numberList.add(100);
		numberList.add(200);
		numberList.add(300);
		numberList.add(400);
		System.out.println(numberList.size());
		
		//how data from dyamic array
		numberList.remove(2);
		System.out.println(numberList.size());
		
// how fill ur array with use add methodv		
		ArrayList <String> empList = new ArrayList <String> (Arrays.asList("ag","rg","hd","as"));
		
		System.out.println(empList.size());
		
		empList.add("aa");
		System.out.println(empList.size());
		empList.remove(0);
		System.out.println(empList);
		
		//how to add data with index no
		empList.add(0,"aa");
		
		for(String e:empList) {
			System.out.println(e);
			
		}
		
		//how to use arrylist in difffernt way
		
		List <Integer> nums = Arrays.asList(1,2,3,5,6,7);
		System.out.println(nums);
		System.out.println(nums.size());
		
		List <String> browser = Arrays.asList("IE","CHROME","FIREFOX","Safari");
		
		
		// how to sort data we collection is method which pre define
		
		ArrayList <Integer> no = new ArrayList ();
		
		no.add(6);
		no.add(2);
		no.add(3);
		no.add(4);
		no.add(5);
		
		
		System.out.println(no.size());
		System.out.println(no);
		
		Collections.sort(no);//use sort with help of Collections method
		System.out.println(no);
		
		Collections.reverse(no);
		System.out.println(no);
		
		
		//how use sort in static data
		
		int neo []= {11,33,55,44,77,99,88};
		System.out.println(neo.length);
		System.out.println(Arrays.toString(neo));
		
		Arrays.sort(neo);
		
		//
		
		System.out.println("=================");
		
		//how to create same copy of same data
		
		ArrayList <String> copy = new ArrayList <String>(Collections.nCopies(5,"sugar"));
		System.out.println(copy.size());
		System.out.println(copy);
		
		
		
		

	}

}
