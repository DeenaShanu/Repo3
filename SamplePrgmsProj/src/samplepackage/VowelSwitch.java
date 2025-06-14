package samplepackage;

import java.util.Scanner;

public class VowelSwitch {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		char exp = scanObj.next().charAt(0);
		switch (exp) {
		case 'a' : System.out.println("VOWEL");break;
		case 'e' :System.out.println("VOWEL");break;
		case 'i' :System.out.println("VOWEL");break;
		case 'o' :System.out.println("VOWEL");break;
		case 'u' :System.out.println("VOWEL");break;
		default : System.out.println("N O T");
		
		
		}

	}

}
