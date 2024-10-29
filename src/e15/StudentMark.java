package e15;

public class StudentMark {
	
	public int Smark(String studentName) {
		System.out.println("Enter student name"+ " "+ studentName);
		int mark =-1;
		
		if(studentName.equalsIgnoreCase("jay")){
			mark =90;
		}else if(studentName.equalsIgnoreCase("aditya")){
			mark=100;
		}else if(studentName.equalsIgnoreCase("vipul")) {
			mark=35;
	 	}else {
			System.out.println("student not found");
		}
			return mark;
			//we can't multiple value,you can only retrun one value;
	}


	public static void main(String[] args) {
		
		StudentMark s1 =new StudentMark();
		int gg=s1.Smark("jay");
		System.out.println(gg);
		
		int jj =s1.Smark("tom");
		System.out.println(jj);
		
		//main method exeuation of program
		if (jj>=0) {
			System.out.println("print the mark sheet");
		}
		

	}

}
