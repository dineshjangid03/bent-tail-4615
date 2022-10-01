package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.EmployeeException;
import model.Employee;
import model.Leave;
import utility.DButil;

public class LeaveDaoImpl implements LeaveDAO {

	@Override
	public String requestLeave(int id, String startDate, String endDate) {
		String message="not applied for leave";
		
		try (Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("insert into leaves(empID,leavefrom,leavetill) values(?,?,?);");
			
			ps.setInt(1, id);
			ps.setString(2, startDate);
			ps.setString(3, endDate);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Successfully applied for leave";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public String approveLeave(int id) {
		String message="Not Approved";
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("update leaves set status='Approved' where empid=?");
			
			ps.setInt(1, id);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Approved";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String rejectLeave(int id) {
		String message="Not Rejected";
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("update leaves set status='Rejected' where empid=?");
			
			ps.setInt(1, id);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Rejected";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public List<Leave> pendingLeaves() {
		List<Leave> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select l.empid, l.status, e.firstname, e.lastname, l.leavefrom, l.leavetill, e.departmentid from leaves l inner join employee e on e.id=l.empid and l.status='pending';");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Leave leave=new Leave();
				leave.setEmployeeId(rs.getInt("empid"));
				leave.setStartDate(rs.getString("leavefrom"));
				leave.setEndDate(rs.getString("leavetill"));
				leave.setStatus(rs.getString("status"));
				leave.setFirstName(rs.getString("firstname"));
				leave.setLastName(rs.getString("lastname"));
				leave.setDepartmentID(rs.getInt("departmentid"));
				list.add(leave);
			}
			
		} catch (SQLException e) {}
		
		return list;
	}

}
