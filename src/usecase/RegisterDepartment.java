package usecase;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;

public class RegisterDepartment {

	public static void main(String[] args) {
		
		DepartmentDAO dao = new DepartmentDaoImpl();
		String res=dao.registerDepartment("marketing");
		System.out.println(res);

	}

}
