package usecase;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import model.Department;

public class UpdateDepartment {

	public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDaoImpl();
		
		String res=dao.updateDepartment(new Department(8, "demo"));
		
		System.out.println(res);
		
	}

}
