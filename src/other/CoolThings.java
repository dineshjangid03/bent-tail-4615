package other;

public class CoolThings {
	
	public static void loding() {
    	System.out.println();
    	System.out.print("Loading");
        for(int i=0; i<3; i++) {
        	System.out.print(".");
        	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        System.out.println("   Done!");
    }
	
	public static void thank() {
    	System.out.println();
    	String str="Thank You...!";
        for(int i=0; i<str.length(); i++) {
        	System.out.print(str.charAt(i));
        	if(str.charAt(i)!=' ') {
        		try {
    				Thread.sleep(200);
    			} catch (InterruptedException e){}
        	}
        }
        System.out.println();
        System.out.println();
    }

}
