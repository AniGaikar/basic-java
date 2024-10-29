package e16;

import java.util.ArrayList;

public class MethodOverLoading {
	
	public boolean lunchBrowser(String browser) {
		
		boolean flag=true;
		
		switch (browser) {
		case "chrome":
			System.out.println("you have selected "+" "+browser);
			break;
			
		case "ie":
			System.out.println("you have selected "+" "+browser);
			break;
			
		case "firefox":
			System.out.println("you have selected "+" "+browser);
			break;

		default:
			System.out.println("you have enter incorrect, which is not present in database");
			flag = false;
			break;
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	public ArrayList<String> empList(String companyName) {
		
		ArrayList <String> empList = new ArrayList <String>();
		
		switch (companyName.toUpperCase().trim()) {
		case "IBM":
				empList.add("Nj");
				empList.add("Tj");
				empList.add("Pj");
			
			break;
		case "TCS":
			
				empList.add("Kg");
				empList.add("Mc");
				empList.add("Fu");
						break;
		case "INFY":
				empList.add("XXX");
				empList.add("LLL");
				empList.add("PPP");
			break;

		default:
			System.out.println("There is no such a company"+" "+ companyName);
			break;
		}
		return empList;
	}

	public static void main(String[] args) {
		
		MethodOverLoading b1 = new MethodOverLoading();
		
		ArrayList<String> aa =b1.empList("tcs");
		
		System.out.println(aa);
		
		
		MethodOverLoading c2 = new MethodOverLoading();
		
		boolean cc= c2.lunchBrowser("chrome");
		
		if(cc) {
			System.out.println("enter url");
		}else {
			System.out.println("no url found");
		}
		
		System.out.println(cc);
		
		
	}

}
