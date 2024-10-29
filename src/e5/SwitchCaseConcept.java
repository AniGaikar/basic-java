package e5;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "firefox";
		
		switch (browser) {
		case "chrome":
			System.out.println("lanuch chrome");
			break;
		case "ie":
			System.out.println("lanuch ie");
			break;
		case "Safari":
			System.out.println("lanuch Safari");
			break;
		case "firefox":
			System.out.println("lanuch firefox");
			break;

		default:
			System.out.println("plz pass the right browser");
			break;
		}
		
final String vowel = "v ";
		
		switch (vowel) {
		case "a":
			System.out.println("is vowel");
			
			break;
		case "e":
			System.out.println("is vowel");
			
			break;
		case "i":
			System.out.println("is vowel");
			
			break;
		case "o":
			System.out.println("is vowel");
			
			break;
		case "u":
			System.out.println("is vowel");
			
			break;
		case "y":
			System.out.println("is vowel");
			
			break;
		default:
			System.out.println("is not a vowel");
			break;
		}
		
		String enviorment = "uAt";
		
		switch (enviorment.toLowerCase().trim()) {
		case "qa":
			System.out.println("you are in qa Enviroment");
			
			break;
		case "stage":
			System.out.println("you are in stage Enviroment");
			
			break;
		case "dev":
			System.out.println("you are in dev Enviroment");
			
			break;
		case "uat":
			System.out.println("you are in uat Enviroment");
			
			break;
		case "prod":
			System.out.println("you are in prod Enviroment");
			
			break;

		default:
			System.out.println("plz pass correct the enviroment" + enviorment);
			break;
		}

	}

}
