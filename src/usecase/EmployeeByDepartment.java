package usecase;

import java.util.List;
import java.util.Scanner;

import Print.PrintEmployee;
import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class EmployeeByDepartment {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Department ID");
		
		int id=sc.nextInt();
		
		EmployeeDAO emp=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp.employeeByDepartment(id);
			PrintEmployee.printEmployeeList(list);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
