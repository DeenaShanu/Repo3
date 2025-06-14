package exceptionPackage;

public class ArithmtcExcepCls {

	public static void main(String[] args) {
		int age = 8;
		
		if (age >= 18) {
			System.out.println("Eligble for voting");
			} else {
			
				try {
					throw new ArithmeticException(" not eligible");
				} finally {
				System.out.println("Age " +  age);
					}
				}
		}
	}


