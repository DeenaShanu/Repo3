package exceptionPackage;

public class FinallyExcepCls {

	public static void main(String[] args) {
		
		try { 
			int num = 0;
			System.out.println(num/0);
		} catch (Exception e) {
			System.out.println(e);
			
			System.out.println( 10/10);
		}  finally {
		System.out.println(" after try");
		}
		System.out.println("aftr finalllyy");//since catch block done
		
		
		
	}

}
