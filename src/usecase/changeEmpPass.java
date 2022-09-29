package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;

public class changeEmpPass {

	public static void main(String[] args) {
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		String res=d.changeEmpPassword(6);
		
		System.out.println(res);

	}

}
