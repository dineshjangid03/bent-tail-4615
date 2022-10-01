package dao;
import java.util.List;
import exception.EmployeeException;
import model.Employee;

public interface EmployeeDAO {
	
	public String registerEmployee(Employee employee);
	
	public List<Employee> getAllEmployee()throws EmployeeException;
	
	public String changeDepartment(int employeeID, int newDepartmentID);
	
	public String changeEmpPassword(int id);
	
	public Employee getEmployeeByID(int id)throws EmployeeException;
	
	public String updateEmployee(String type, String typeName, int id);
	
	public List<Employee> employeeByDepartment(int id)throws EmployeeException;

}
