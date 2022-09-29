package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class getEmployee {

	public static void main(String[] args) {
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		try {
			Employee res=d.getEmployeeByID(6);
			System.out.println(res);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
