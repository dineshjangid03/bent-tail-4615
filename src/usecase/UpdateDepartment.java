package usecase;

import java.util.Scanner;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import model.Department;

public class UpdateDepartment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Department ID");
		int did=sc.nextInt();
		
		System.out.println("Enter new name for Department");
		String dname=sc.next();
		
		DepartmentDAO dao=new DepartmentDaoImpl();
		
		String res=dao.updateDepartment(new Department(did, dname));
		
		System.out.println(res);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
	}

}
