package e20;

public class Encapsulation {
	
	private String name;
	private String city;
	private String country;
	private String code;
	
	public Encapsulation(String name, String city, String country, String code) {
		this.name = name;
		this.city = city;
		this.country = country;
		this.code = code;
	}

	//encapsulation help us to reach private key variable 
	//using getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	
}
