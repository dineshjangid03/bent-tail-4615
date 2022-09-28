package dao;
import java.util.List;
import exception.EmployeeException;
import model.Employee;

public interface EmployeeDAO {
	
	public String registerEmployee(Employee employee);
	
	public List<Employee> getAllEmployee()throws EmployeeException;

}
