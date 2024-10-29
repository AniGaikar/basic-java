package e6;

public class SwitchCaseHomeLoan {

	public static void main(String[] args) {
		String loanType = "loan";
		int salary = 20000;
		
		switch (loanType.toLowerCase().trim()) {
		case "carloan":
			System.out.println("You have appiled for CarLoan and interest rate is 8%");	
			break;
			
		case "personalloan":
			System.out.println("You have appiled for Personal Loan and interest rate is 10%");
			break;
			
		case "educationloan":
			System.out.println("You have appiled for Eduction Loan and interest rate is 12%");
			break;
			
		case "houseloan":
			System.out.println("You have appiled for HouseLoan and interest rate is 20%");
			salary = 30000;
			if (salary >=35000) {
				System.out.println("You are appicable for Home Loan");
			}
			else {
				System.out.println("You are not appicable for Home Loan");
			}

			break;
		default:
			System.out.println("you have enter invalid entery");
//			System.out.println(salary);
			break;
		}
		
	}

}
