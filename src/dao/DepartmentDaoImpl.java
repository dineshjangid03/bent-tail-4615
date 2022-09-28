package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.DepartmentException;
import model.Department;
import utility.DButil;

public class DepartmentDaoImpl implements DepartmentDAO {
	
	

	@Override
	public String registerDepartment(String name) {
		
		String message="Department not added !";
		
		try (Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("insert into department (name) values (?)");
			
			ps.setString(1, name);
			
			int x=ps.executeUpdate();
			
			if(x>0)
				message="Department added Sucessfully !";

			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

	
	
	
	@Override
	public List<Department> getAllDepartment() throws DepartmentException {
		
		List<Department> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from department");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				
				Department d=new Department(id, name);
				
				list.add(d);
				
			}
			
		}catch(SQLException e) {
			throw new DepartmentException(e.getMessage());
		}
		
		if(list.size()==0)
			throw new DepartmentException("No Department found");

		return list;
	}




	@Override
	public String updateDepartment(Department department) {
		String message="Department not found";
		
		try(Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("update department set name=? where id=?");
			
			ps.setString(1, department.getName());
			ps.setInt(2, department.getId());
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Department updated";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

}
