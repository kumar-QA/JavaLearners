package conditional_staments;

public class SwitchCase {

	public static void main(String[] args) {
		int number=100;
		switch(number) {
		
		case 1: System.out.println("Monday");
		         break;
		case 2: System.out.println("Tuesday");
		         break;
		case 3: System.out.println("Wednesday");
		         break;
		case 4: System.out.println("Thursday");
		          break;
		case 5: System.out.println("Friday");
		        break;
		case 6: System.out.println("saturday");
				break;
		case 7: System.out.println("sunday");
				break;
		default: System.out.println("invalid weekday");		
				
		}
		
	
		
		  // Custom input string
        String str = "two";
 
        // Switch statement over above string
        switch (str) {
 
        // Case 1
        case "one":
 
            // Print statement corresponding case
            System.out.println("one");
 
            // break keyword terminates the
            // code execution here itself
            break;
 
        // Case 2
        case "two":
 
            // Print statement corresponding case
            System.out.println("two");
            break;
 
        // Case 3
        case "three":
 
            // Print statement corresponding case
            System.out.println("three");
            break;
 
        // Case 4
        // Default case
        default:
 
            // Print statement corresponding case
            System.out.println("no match");
        }

		
		
	}

}
