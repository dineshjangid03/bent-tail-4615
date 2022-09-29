package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import model.Employee;

public class RegisterEmployee {
	

	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDaoImpl();
		
		String res= dao.registerEmployee(new Employee("Sujeet", "kumar", "99999999", "sujeet@com", "s@pass", "2004-06-01", "DL", 20000, "2022-06-01", 8));
		
		System.out.println(res);

	}
	
}
