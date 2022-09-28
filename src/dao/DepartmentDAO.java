package dao;
import java.util.*;

import exception.DepartmentException;
import model.Department;

public interface DepartmentDAO {
	
	public String registerDepartment(String name);
	
	public List<Department> getAllDepartment()throws DepartmentException;
	
	public String updateDepartment(Department department);

}
