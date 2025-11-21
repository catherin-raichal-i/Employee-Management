package console;

import java.util.*;

public class EmployeeImplementation {

	//CRUD
	
	Scanner scan=new Scanner(System.in);
	ArrayList <Employee> list=new ArrayList<>();
	
	public void create() {
		System.out.print("Enter your Employee ID - ");
		int id=scan.nextInt();
		
		scan.nextLine();
		System.out.print("Enter your Employee Name - ");
		String name=scan.nextLine();
		
		list.add(new Employee(id,name));
		
		System.out.println("Record added Successfully! ");
		
	}
	
	public void read() {
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public void update() {
		
		System.out.print("Enter your Employee ID to update - ");
		int id=scan.nextInt();
		
		for(int i=0;i<list.size();i++) {
			if(id==list.get(i).getEmpID()) {
				scan.nextLine();
				System.out.print("Enter your Updated Name: ");
				String updName=scan.nextLine();
				
				list.get(i).setEmpName(updName);
			}
		}
		
		System.out.println("Record Updated Successfully! ");
		
	}
	
	public void delete(){
		
		System.out.print("Enter your Employee ID to delete - ");
		int id=scan.nextInt();
		
		for(int i=0;i<list.size();i++) {
			if(id==list.get(i).getEmpID()) {
				list.remove(i);
			}
		}
		
		System.out.println("Record Deleted Successfully! ");
		
		
	}
	
	
}
