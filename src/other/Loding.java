package other;

public class Loding {

	public static void loding() {
    	System.out.println();
    	System.out.print("Loading");
        for(int i=0; i<10; i++) {
        	System.out.print(".");
        	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
	
}
