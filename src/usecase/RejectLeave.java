package usecase;

import dao.LeaveDAO;
import dao.LeaveDaoImpl;

public class RejectLeave {

	public static void main(int id) {

		LeaveDAO l=new LeaveDaoImpl();
		
		String res=l.rejectLeave(id);
		
		System.out.println(res);

		
	}

}
