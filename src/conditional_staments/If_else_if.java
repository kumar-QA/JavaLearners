package conditional_staments;

public class If_else_if {

	public static void main(String[] args) {
		int marks=65;
		
		if(marks<35) {
			System.out.println("failed");
		}else if(marks>=35 && marks<45 ) {
			System.out.println("Just pass");
		}else if(marks>=45 && marks<55) {
			System.out.println("Grade c");
		}else if(marks>=55 && marks<75) {
			System.out.println("Grade B");
		}else if(marks>=75 && marks<90) {
			System.out.println("Grade A");
		}else if(marks>=90 && marks<=100) {
			System.out.println("Grade A+");
		}else {
			System.out.println("invalid marks");
		}
		
		
		
		
	}

}
