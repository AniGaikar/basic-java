package e30;

import java.util.HashMap;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashmap never mantain order
		
		HashMap<String,String> empMap = new HashMap<String,String>();
		
		empMap.put("a", "mj");
		empMap.put("b", "Tj");
		
		System.out.println(empMap.get("a"));
		
		HashMap<String,Integer> student = new HashMap<String,Integer>();
		student.put("a", 100);
		student.put("b", 200);
		student.put("a", 400);
		student.put(null, 100);
		student.put(null, 100);
		
		// how to every data form hashmap
		//we have to use lamda "->" this is lamda
		// its not a for loop
		
		student.forEach((a,b)-> System.out.println(a+":"+b));
		
		
		//hashmap store it value in hashvalue
	}

}
