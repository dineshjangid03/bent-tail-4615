package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;

public class transferEmployee {

	public static void main(String[] args) {
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		String res=d.changeDepartment(6, 10);
		
		System.out.println(res);
		
	}

}
