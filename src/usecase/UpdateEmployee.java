package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;

public class UpdateEmployee {

	public static void main(int id) {

		try {
		System.out.println();
		System.out.println("    ╔═══════════════════╗");
		Thread.sleep(50);
		System.out.println("        Select update");
		Thread.sleep(50);
		System.out.println("    ╚═══════════════════╝");
		Thread.sleep(50);
		System.out.println("1. First Name      2. Last Name");
		Thread.sleep(50);
		System.out.println("3. Mobile          4. Email");
		Thread.sleep(50);
		System.out.println("5. DOB             6. Address");
		Thread.sleep(50);
		System.out.println("7. Password        8. go back");
		} catch (InterruptedException e1) {}
		
		
		Scanner sc=new Scanner(System.in);
		int choice=8;
		
		try {
			choice=sc.nextInt();
		} catch (Exception e) {}
		
		String column="";
		String value="";
		
		switch(choice) {
		case 1:
			System.out.println("Enter Your New First Name");
			column="firstname";
			value=sc.next();
			break;
			
		case 2:
			System.out.println("Enter Your New Last Name");
			column="lastname";
			value=sc.next();
			break;
			
		case 3:
			System.out.println("Enter Your New Mobile");
			column="mobile";
			value=sc.next();
			break;
		case 4:
			System.out.println("Enter Your New Email");
			column="email";
			value=sc.next();
			break;
		case 5:
			System.out.println("Enter Your New DOB in yyyy-mm-dd Format");
			column="dateofbirth";
			value=sc.next();
			break;
		case 6:
			System.out.println("Enter Your New Address");
			column="address";
			sc.nextLine();
			value=sc.nextLine();
			break;
		case 7:
			System.out.println("Enter Your New Password");
			column="password";
			value=sc.next();
			break;
			
		default :
			return;

		}
		
		EmployeeDAO e=new EmployeeDaoImpl();
		
		String res=e.updateEmployee(column, value, id);
		
		System.out.println(res);
		

	}

}
