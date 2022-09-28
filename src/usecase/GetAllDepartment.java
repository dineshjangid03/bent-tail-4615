package usecase;

import java.util.List;
import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import exception.DepartmentException;
import model.Department;

public class GetAllDepartment {
	
	public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDaoImpl();
		
		try {
			List<Department>list=dao.getAllDepartment();
			
			list.forEach(s-> System.out.println(s));
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
