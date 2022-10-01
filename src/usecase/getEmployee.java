package usecase;

import Print.PrintEmployee;
import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class getEmployee {

	public static void main(int id) {
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		try {
			Employee res=d.getEmployeeByID(id);
			PrintEmployee.printSingleEmployee(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	

}
