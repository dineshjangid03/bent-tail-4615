package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import model.Employee;

public class RegisterEmployee {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name of Employee");
		String fname=sc.next();
		System.out.println("Enter Last Name of Employee");
		String lname=sc.next();
		System.out.println("Enter Mobile of Employee");
		String mob=sc.next();
		System.out.println("Enter Email of Employee");
		String email=sc.next();
		System.out.println("Enter Password of Employee");
		String pass=sc.next();
		System.out.println("Enter DOB of Employee in yyyy-mm-dd format");
		String dob=sc.next();
		System.out.println("Enter Address of Employee");
		sc.nextLine();
		String add=sc.nextLine();
		System.out.println("Enter Salary of Employee");
		int sal=sc.nextInt();
		System.out.println("Enter Hire Date of Employee in yyyy-mm-dd format");
		String HD=sc.next();
		System.out.println("Enter Department ID for Employee");
		int did=sc.nextInt();
		EmployeeDAO dao=new EmployeeDaoImpl();
		
		String res= dao.registerEmployee(new Employee(fname, lname, mob, email, pass, dob, add, sal, HD, did));
		
		System.out.println(res);

	}
	
}
