package e6;

public class SwitchCaseStudentMark {

	public static void main(String[] args) {
		String stName = "nj";
		int mark = 77;
		
		switch (stName.trim()) {
		case "Anirudha":
			System.out.println("Anirudha is passed");
			break;
			
		case "Ratnadeep":
			System.out.println("Ratnadeep is passed");
			break;
		case "Hemant":
			System.out.println("Hemant is passed");
			break;
		case "Akshay":
			System.out.println("Akshay is passed");
			break;

		default:
			System.out.println("Student not found in database " + stName);
			mark = -1;
			break;
		}		
			System.out.println(mark);
			if (mark>=0) {
				System.out.println("print the mark sheet");
			}
			else {
				System.out.println("Dont print Marksheet");
			}
			
			String carType ="Mini";
			
			switch (carType.toLowerCase().trim()) {
			case "mini":
				System.out.println("You have booked Mini car");
				break;
			case "sedan":
				System.out.println("You have booked Sedan car");
				break;
			case "suv":
				System.out.println("You have booked SUV car");
				break;
			case "premium":
				System.out.println("You have booked Premium car");
				break;

			default:
				System.out.println("CarType not found" + carType);
				break;
			}

	}

}
