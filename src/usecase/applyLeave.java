package usecase;

import java.util.Scanner;
import dao.LeaveDAO;
import dao.LeaveDaoImpl;

public class applyLeave {

	public static void main(int id) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Leave from Date in yyyy-mm-dd format");
		String startDate=sc.next();
		System.out.println("Leave till Date in yyyy-mm-dd format");
		String endDate=sc.next();
		LeaveDAO l=new LeaveDaoImpl();
		
		String res=l.requestLeave(id, startDate, endDate);
		
		System.out.println();
		System.out.println(res);
		
		
	}

}
