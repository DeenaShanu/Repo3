package exceptionPackage;

import java.util.Scanner;

public class NullPointerCls {

	public static void main(String[] args) throws  NullPointerValueException {
		Scanner obj = new Scanner(System.in);
		String n = obj.next();
		String m = obj.next();
		if (m.equals("S") && n.equals("S")) {
			
			System.out.println("S");
			} 	else {
			try {
				throw new NullPointerValueException("Not S ");
			} finally {
				System.out.println("Execute this");
			}
			}
		}
		
	
	}

