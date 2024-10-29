package e19;

public class User {

	String firstName;
	String lastName;
	String emailID;
	String phone;
	String password;
	String city;

	// AC:
	// User can created if you have
	// Fn,Ln
	// fn,ln,emailid
	// fn
	// fn,ln,pssword
	// fn.ln,emaild,phone,password
	// fn.ln,emaild,phone,password,city

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public User(String firstName, String lastName, String emailID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}

	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String phone, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.password = password;
	}

	public User(String firstName, String lastName, String emailID, String phone, String password, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User uq = new User("kg");
		System.out.println(uq.firstName);
		uq.lastName = "gd";
		System.out.println(uq.firstName + " " + uq.lastName);

		User uu = new User("Nj", "bj", "nj,bj@gmail.com", "9999999", "njlover", "mumbai");
		System.out.println(uu.firstName + " " + uu.lastName + " " + uu.password + " " + uu.emailID + " " + uu.city);

		uu.city = "mahad";
		System.out.println(uu.firstName + " " + uu.lastName + " " + uu.password + " " + uu.emailID + " " + uu.city);

		// Difference between the method and constructor
		// in method we can't resists the object
		// when to use method and constructor
		// for business logic is written in method for the feature we use method;
		// the reusebility in method is key

	}

}
