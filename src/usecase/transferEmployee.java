package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;

public class transferEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int eid=sc.nextInt();
		
		System.out.println("Enter Department ID");
		int did=sc.nextInt();
		
		EmployeeDAO d=new EmployeeDaoImpl();
		
		String res=d.changeDepartment(eid,did);
		
		System.out.println(res);
		
	}

}
