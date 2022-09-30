package usecase;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class GetAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDAO emp=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp.getAllEmployee();
			main(list);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public static void main(List<Employee>list){  
 
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
		System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s", "EMP ID | ", "FIRST NAME | ", "LAST NAME | ", "MOBILE | ", "E-MAIL ID | ", "PASSWORD | ","DATE OF BIRTH | ","ADDRESS | ", "SALARY | ","HIRE DATE | ","D ID");  
		System.out.println();  
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
		System.out.println();  
		for(Employee e: list){  
			System.out.format("%5s %12s %12s %12s %12s %10s %14s %10s %10s %14s %6s", e.getId(), e.getFirstName(), e.getLastName(), e.getMobile(), e.getEmail(), e.getPassword(), e.getDateOfBirth(),e.getAddress(),e.getSalary(),e.getHireDate(),e.getDepartmentID());  
			System.out.println(); 
			System.out.println();
		}  
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
	}  

}
