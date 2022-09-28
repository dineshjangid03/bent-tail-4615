package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.EmployeeException;

import java.sql.Date;
import model.Employee;
import utility.DButil;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public String registerEmployee(Employee employee) {
		
		String message="Employee not Registered !";
		
		try(Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement
			("insert into employee(firstName,lastName,mobile,email,password,dateOfBirth,address,salary,hireDate,departmentID) values(?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getMobile());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getPassword());
			ps.setString(6, employee.getDateOfBirth());
			ps.setString(7, employee.getAddress());
			ps.setInt(8, employee.getSalary());
			ps.setString(9, employee.getHireDate());
			ps.setInt(10, employee.getDepartmentID());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Employee Registered Sucessfully !";
			
		}catch(SQLException e) {
			message=e.getMessage();
		}
		
		return message;
		
	}

	
	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		List<Employee> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("firstName"));
				e.setLastName(rs.getString("lastName"));
				e.setMobile(rs.getString("mobile"));
				e.setEmail(rs.getString("email"));
				e.setPassword(rs.getString("password"));
				e.setDateOfBirth(rs.getString("dateOfBirth"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getString("hireDate"));
				e.setDepartmentID(rs.getInt("departmentID"));
				
				list.add(e);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(list.size()==0) {
			throw new EmployeeException("List is empty");
		}
		
		return list;
	}

}
