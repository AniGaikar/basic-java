package e5;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loop
		int number = 150;
		
		if(number <= 100) {
			System.out.println("calculating your mark");
			
			if(number >= 90) {
				System.out.println("you got Grade A");
				
				if(number == 100) {
					System.out.println("your are scholar");
				}
				else {
					System.out.println("your are not a scholar");
				}
			}
			else {
				System.out.println("you got Grade d");
			}
		}
		else {
			System.out.println("plz pass right mark");
		}
		
		
		//if-elseif
		
//		String browser ="chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firfox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		if(browser.equals("ie")) {
//			System.out.println("launch ie");
//		}
//		else {
//			System.out.println("plase pass right browser...");// it take code near by it so take comdtion from the ie
//		}
		
		
		//if-elseif 
String browser ="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firfox");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		else {
			System.out.println("plase pass right browser...");
	}
	}
}
