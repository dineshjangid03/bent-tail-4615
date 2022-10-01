package utility;

import java.sql.Connection;

public class checkCon {
	


		public static void main(String[] args) {
			
			Connection con=DButil.getConnection();
			
			if(con!=null) {
				System.out.println("connected");
			}
			else {
				System.out.println("not");
			}
			

		}

		
}