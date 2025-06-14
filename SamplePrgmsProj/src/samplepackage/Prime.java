package samplepackage;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {

		Prime obj = new Prime();
		// obj.prime(30);
		// obj.checkArmstrong(153);
		// obj.printArray();
		// obj.sumOfArray();
		// obj.reverseAString("TESTING");
		// obj.rightTriangleStarPattern();
		// obj.leftTriangleStarPattern();
		// obj.occurrenceOfCharacters();
		// obj.linearSearch();
		// obj.left();
		// obj.right();
		// obj.triangle();
		// obj.invertedTri();
		// obj.rightT();
		// obj.duplicate();
		//obj.dupStrng();
		obj.matrix();
	}

	public void prime(int n) {
		int cnt = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			System.out.println(n + " is a Prime number");
		} else {
			System.out.println(n + " is a Composite number");
		}
	}

	public void checkArmstrong(int n) {
		int num = n;
		int sum = 0;
		int mod = 0;
		while (n > 0) {
			mod = n % 10;
			sum = sum + mod * mod * mod;
			n = n / 10;
		}
		if (sum == num) {
			System.out.println(sum + " is Armstrong");
		} else {
			System.out.println(sum + " is not an Armstrong");
		}
	}

	public void printArray() {
		int a[] = { 1, 3, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void sumOfArray() {
		int a[] = { 2, 2, 2, 1 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("SUM is " + sum);
	}

	public void reverseAString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse of " + str + " is " + rev);
	}

	public void rightTriangleStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void leftTriangleStarPattern() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void occurrenceOfCharacters() {

		String s = "rrooowwwwwpppprrrrrr";
		char letter = 'r';
		int cnt = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (letter == ch[j]) {
					cnt++;
				}
			}
			System.out.println("Occurence of " + letter + " : " + cnt);
			break;
		}
	}

	public void linearSearch() {
		int a[] = { 1, 3, 4, 5, 6 };
		boolean found = false;
		int num = 7;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				found = true;
			}
		}
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

	public void left() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public void right() {
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void triangle() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void invertedTri() {
		for (int i = 0; i < 10; i++) {
			for (int m = 0; m <= i; m++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j < 10 - i; j++) {
				System.out.print("*");
			}

			for (int k = 0; k <= i + 1; k++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

	public void rightT() {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("##############");
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void dupStrng() {
		String var[] = { "Anna", "Mira", "Anna" };
		int cnt = 0;
		String str = "Anna";
		for (int i = 0; i < var.length; i++) {

			if (str.equalsIgnoreCase(var[i])) {
				cnt++;
			}

		}
		if (cnt > 1) {
			System.out.println("Found duplicates");
		} else {
			System.out.println("No duplicates");
		}
	}

	public void duplicate() {
		int cnt = 0;
		int a[] = { 10, 10, 11, 12, 12, 13 };
		int num = 12;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				cnt++;
			}
		}
		if (cnt > 1) {
			System.out.println(cnt + "  Duplicates");
		} else {
			System.out.println("No duplicates");
		}
	}

	public void matrix() {
		int a[][] = { { 1, 2,0 }, { 3, 4,0 },{4,5,0} };
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]); 
				System.out.print("\t");
			}
				
			System.out.println();

		}
	}

}
