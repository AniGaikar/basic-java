package e13;

public class VariableType {
	
	//Class variable -- class data member
	String name; //Global variable
	int age;
	String city;
	// class high terms for object
	// class is template/blueprint of the object / category of the object
	// class eg car is class but suv,mpv are object
	// object--is a physical entities
	
	
//	Variable is class name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name ="NG";//local variable
//		System.out.println(name);
		
		// how to create object of class
		VariableType obj = new VariableType();
		obj.name = "tom";
		//obj object variable name;
		// this non primitive data type because of we are using class
		// new VariableType is object
		// obj is variable (obj is obj refer name) type of variable is VariableType
		// VariableType is class name
		
		
		// obj is memory for object now memory act as space for global variable 
		// this memory can access with . method 
		// so now global variable are accessible in local method
		
		//default value of String is null
		//0 is default of int
		
		VariableType a = new VariableType();
		a.city="mahad";
		
		System.out.println(obj.name);
		System.out.println(a.city);
		
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		
		//no reference object-- not recommend
		new VariableType().age = 89; // we have created new object with referees 
		new VariableType().city = "mahad"; // we have created new object with referees 
		new VariableType().name = "nh"; // we have created new object with referees 

	}

}
