package exceptionPackage;

public class ArithmeticSampleExceptionCls {

	
	
	public static void main(String[] args) {
		
		int a = 9;
		
		try {
		System.out.println(a/0);
		
			} catch (ArithmeticException e) {
				System.out.println("e== " + e);//exception details
//			int num = 9;
//			System.out.println("Catching " + num/3);
		}
		System.out.println(" Aa ");


	}

}
