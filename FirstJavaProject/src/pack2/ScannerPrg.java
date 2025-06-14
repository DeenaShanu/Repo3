package pack2;

import java.util.Scanner;

public class ScannerPrg {

	public static void main(String[] args) {

		Scanner scnObj =  new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scnObj.nextInt();
		System.out.println("Enter  number");
		int b = scnObj.nextInt();
		int c = 0;
		c = a+ b;
		System.out.println("c== " + c);

	}

}
