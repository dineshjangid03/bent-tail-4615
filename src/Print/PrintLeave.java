package Print;

import java.util.List;

import model.Leave;

public class PrintLeave {
	
	public static void printLeaveList(List<Leave>list) {
		for(Leave leave:list) {
			try {
			System.out.println("EMPLOYEE ID   : "+leave.getEmployeeId());
			Thread.sleep(20);
			System.out.println("EMPLOYEE NAME : "+leave.getFirstName()+" "+leave.getLastName());
			Thread.sleep(20);
			System.out.println("DEPARTMENT ID : "+leave.getDepartmentID());
			Thread.sleep(20);
			System.out.println("START DATE    : "+leave.getStartDate());
			Thread.sleep(20);
			System.out.println("END DATE      : "+leave.getEndDate());
			Thread.sleep(20);
			System.out.println("STATUS        : "+leave.getStatus());
			Thread.sleep(20);
			System.out.println();
			} catch (InterruptedException e) {}
		}
	}

}
