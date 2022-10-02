package other;

import java.util.Scanner;
import exception.EmployeeException;
import model.Employee;

public class Home {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String WHITE_BOLD = "\033[1;37m";
	
	
	
	public static void options() {
		
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println(""
					+CYAN_BOLD+ "╔═══════════════════╗\r\n"
					+CYAN_BOLD+ "    CHOOSE OPTION\r\n"
					+CYAN_BOLD+ "╚═══════════════════╝\r\n"
					+CYAN_BOLD+ "1. Admin login\r\n"
					+CYAN_BOLD+ "2. Employee login\r\n"
					+CYAN_BOLD+ "3. Exit"+ANSI_RESET);
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				if(Login.adminLoginAuth()) {
					Panels.adminPanel();
				}
				else {
					System.out.println(RED_BOLD+"Wrong credentials"+ANSI_RESET);
				}
				break;
			case 2:
				try {
					Employee emp=Login.employeeLoginAuth();
					Panels.employeePanel(emp);
				} catch (EmployeeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("See You...!");
				System.exit(0);
			}
		}
		
	}

}
