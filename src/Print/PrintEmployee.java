package Print;

import java.util.List;

import model.Employee;

public class PrintEmployee {
	
	public static final String WHITE_BOLD = "\033[1;37m";
	public static final String ANSI_RESET = "\u001B[0m";
	
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
			System.out.println(WHITE_BOLD+"   EMP-ID : "+ANSI_RESET+eid.substring(0, 12)+WHITE_BOLD+"FIRST NAME    : "+ANSI_RESET+fname.substring(0, psl+1)+WHITE_BOLD+"LAST-NAME : "+ANSI_RESET+lname.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println(WHITE_BOLD+"   DEP-ID : "+ANSI_RESET+did.substring(0, 12)+WHITE_BOLD+"DATE OF BIRTH : "+ANSI_RESET+dob.substring(0,   psl+1)+WHITE_BOLD+"HIRE DATE : "+ANSI_RESET+hd.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println(WHITE_BOLD+"   SALARY : "+ANSI_RESET+sal.substring(0, 12)+WHITE_BOLD+"PASSWORD      : "+ANSI_RESET+pass.substring(0,  psl+1)+WHITE_BOLD+"EMAIL     : "+ANSI_RESET+email.substring(0,eml+3));
			Thread.sleep(20);
			System.out.println(WHITE_BOLD+"   MOBILE : "+ANSI_RESET+mob.substring(0, 12)+WHITE_BOLD+"ADDRESS       : "+ANSI_RESET+add.substring(0, adl+3));
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
		System.out.println(WHITE_BOLD+"   ID       : "+ANSI_RESET+e.getId());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Name     : "+ANSI_RESET+e.getFirstName()+" "+e.getLastName());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Mobile   : "+ANSI_RESET+e.getMobile());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Email    : "+ANSI_RESET+e.getEmail());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Password : "+ANSI_RESET+e.getPassword());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   DOB      : "+ANSI_RESET+e.getDateOfBirth());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Address  : "+ANSI_RESET+e.getAddress());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Salary   : "+ANSI_RESET+e.getSalary());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   Hire Date: "+ANSI_RESET+e.getHireDate());
		Thread.sleep(20);
		System.out.println(WHITE_BOLD+"   DEP.ID   : "+ANSI_RESET+e.getDepartmentID());
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
