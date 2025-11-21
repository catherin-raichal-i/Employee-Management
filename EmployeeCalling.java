package console;

import java.util.*;

public class EmployeeCalling {
	
	public static void main(String args[]) {
		
		EmployeeImplementation obj = new EmployeeImplementation();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to CREATE");
			System.out.println("Press 2 to READ");
			System.out.println("Press 3 to UPDATE");
			System.out.println("Press 4 to DELETE");
			System.out.println("Press 5 to EXIT");
			
			System.out.print("Enter your choice: ");
			int choice=scan.nextInt();
			
			switch(choice) {
			
			
			case 1:
				obj.create();
				break;

			case 2:
				obj.read();
				break;
				
			case 3:
				obj.update();
				break;
				
			case 4:
				obj.delete();
				break;

			case 5:
				System.exit(0);
				
			}
		}
		
	}
	
}
