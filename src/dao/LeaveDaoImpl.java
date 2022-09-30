package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
