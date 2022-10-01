package usecase;

import java.util.List;

import Print.PrintDepartment;
import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import exception.DepartmentException;
import model.Department;

public class GetAllDepartment {
	
	public static void main(String[] args) {
		
		DepartmentDAO dao=new DepartmentDaoImpl();
		
		try {
			List<Department>list=dao.getAllDepartment();
			
			PrintDepartment.printDepartmentList(list);

		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
