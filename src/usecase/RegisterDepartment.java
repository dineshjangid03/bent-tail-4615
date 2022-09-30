package usecase;

import java.util.Scanner;
import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;

public class RegisterDepartment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Name");
		sc.nextLine();
		String dname=sc.nextLine();
		DepartmentDAO dao = new DepartmentDaoImpl();
		String res=dao.registerDepartment(dname);
		System.out.println(res);

	}

}
