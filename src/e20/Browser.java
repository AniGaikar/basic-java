package e20;

public class Browser {
	
	private String userName;
	private String password;
	

	public Browser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getPassword() {
		return password;
	}

    public void setPassword(String password) {
		this.password = password;
	}
    
    
    public void getbrowser(String userName, String password) {
    	System.out.println("enter username"+userName);
    	System.out.println("enter password"+password);
    	
    	if(isactive(userName)) {
    		System.out.println("your are aactive user");
    	}
    	else {
    		System.out.println("no user is found");
    	}
    	System.out.println("plz press login");
    	System.out.println("welcome to dashboard");
    }
    
    private boolean isactive(String userName) {
    	System.out.println("check  is active or not");
    	return true;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
