package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import model.Employee;

public class RegisterEmployee {
	

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDaoImpl();
		
		String res= dao.registerEmployee(new Employee("Suresh", "kumar", "9999", "s@com", "@pass", "2005-06-01", "DL", 2000, "2022-05-01", 3));
		
		System.out.println(res);

	}
	
}
