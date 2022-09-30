package usecase;

import dao.LeaveDAO;
import dao.LeaveDaoImpl;

public class ApproveLeave {

	public static void main(int id) {
		
		LeaveDAO l=new LeaveDaoImpl();
		
		String res=l.approveLeave(id);
		
		System.out.println(res);
		
	}

}
