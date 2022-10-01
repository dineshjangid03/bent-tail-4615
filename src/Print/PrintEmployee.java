package Print;

import java.util.List;

import model.Employee;

public class PrintEmployee {
	
	
	public static void printEmployeeList(List<Employee>list){
		
		int fnl=10,lnl=10,eml=0,psl=0,adl=0;
		for(int i=0; i<list.size(); i++) {
			Employee e=list.get(i);
			fnl=Math.max(fnl, e.getFirstName().length());
			lnl=Math.max(lnl, e.getLastName().length());
			eml=Math.max(eml, e.getEmail().length());
			psl=Math.max(psl, e.getPassword().length());
			adl=Math.max(adl, e.getAddress().length());
		}
 
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------"); 
		
		for(Employee e: list){ 
			 
			String eid=e.getId()+"                                       ";
			String fname=e.getFirstName()+"                              ";
			String lname=e.getLastName()+"                               ";
			String mob=e.getMobile()+"                                   ";
			String email=e.getEmail()+"                                  ";
			String pass=e.getPassword()+"                                ";
			String dob=e.getDateOfBirth()+"                              ";
			String add=e.getAddress()+"                                  ";
			String sal=e.getSalary()+"                                   ";
			String hd=e.getHireDate()+"                                  ";
			String did=e.getDepartmentID()+"                             ";
			
			System.out.println();
			try {
			System.out.println("   EMP-ID : "+eid.substring(0, 12)+"FIRST NAME    : "+fname.substring(0, psl+1)+"LAST-NAME : "+lname.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println("   DEP-ID : "+did.substring(0, 12)+"DATE OF BIRTH : "+dob.substring(0,   psl+1)+"HIRE DATE : "+hd.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println("   SALARY : "+sal.substring(0, 12)+"PASSWORD      : "+pass.substring(0,  psl+1)+"EMAIL     : "+email.substring(0,eml+3));
			Thread.sleep(20);
			System.out.println("   MOBILE : "+mob.substring(0, 12)+"ADDRESS       : "+add.substring(0, adl+3));
			Thread.sleep(20);
			System.out.println();
			Thread.sleep(20);
			System.out.println("-------------------------------------------------------------------------------");
			Thread.sleep(20);
			} catch (InterruptedException e1) {}
		} 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {}
		 
	}
	
	
	
	
	
	public static void printSingleEmployee(Employee e) {
		System.out.println();

		try {
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
		Thread.sleep(20);
		System.out.println("");
		Thread.sleep(20);
		System.out.println("   ID       : "+e.getId());
		Thread.sleep(20);
		System.out.println("   Name     : "+e.getFirstName()+" "+e.getLastName());
		Thread.sleep(20);
		System.out.println("   Mobile   : "+e.getMobile());
		Thread.sleep(20);
		System.out.println("   Email    : "+e.getEmail());
		Thread.sleep(20);
		System.out.println("   Password : "+e.getPassword());
		Thread.sleep(20);
		System.out.println("   DOB      : "+e.getDateOfBirth());
		Thread.sleep(20);
		System.out.println("   Address  : "+e.getAddress());
		Thread.sleep(20);
		System.out.println("   Salary   : "+e.getSalary());
		Thread.sleep(20);
		System.out.println("   Hire Date: "+e.getHireDate());
		Thread.sleep(20);
		System.out.println("   DEP.ID   : "+e.getDepartmentID());
		Thread.sleep(20);
		System.out.println("█                                  █");
		Thread.sleep(20);
		System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
		Thread.sleep(20);
		} catch (InterruptedException e1) {}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {}
	}

}
