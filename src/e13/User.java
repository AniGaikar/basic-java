package e13;

public class User {
	
	String name;
	int age;
	String City;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// in java have 0 zero refer
		
		User u1 = new User();
		u1.age=23;
		u1.City="mumbai";
		u1.name="bb";
		
		User u2 = new User();
		u2.age=43;
		u2.City="pune";
		u2.name="cc";
		
		User u3 = new User();
		u3.age=13;
		u3.City="mahad";
		u3.name="aa";
		
		//now consider u1=u2
		u1=u2;
		// in this u1 will consider all the value of u2 and it will print u2 vlaue
		
		System.out.println(u1.City+" "+u1.age+" "+u1.name);
		System.out.println(u2.City+" "+u2.age+" "+u2.name);
		System.out.println(u3.City+" "+u3.age+" "+u3.name);
		
		System.out.println("=======");
		u2=u3;
		System.out.println(u1.City+" "+u1.age+" "+u1.name);
		System.out.println(u2.City+" "+u2.age+" "+u2.name);
		System.out.println(u3.City+" "+u3.age+" "+u3.name);
		
		System.out.println("=======");
		u3=u1;
		System.out.println(u1.City+" "+u1.age+" "+u1.name);
		System.out.println(u2.City+" "+u2.age+" "+u2.name);
		System.out.println(u3.City+" "+u3.age+" "+u3.name);
		
		
		

	}

}
