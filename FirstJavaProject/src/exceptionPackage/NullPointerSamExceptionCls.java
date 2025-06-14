package exceptionPackage;

public class NullPointerSamExceptionCls {

	public static void main(String[] args) {
		
		String var = null;
		System.out.println("Begining");
		try {
			
		System.out.println(var.length());
		
		
		} catch (NullPointerException exp) {
			String ss = "test";
			System.out.println("Length = " + ss.length());
		}
		
		
		System.out.println("Ending");

	}

}
