package usecase;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;

public class changeEmpPass {

	public static void main(int id) {
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		String res=d.changeEmpPassword(id);
		
		System.out.println(res);

	}

}
