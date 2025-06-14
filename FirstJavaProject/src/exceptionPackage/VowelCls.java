package exceptionPackage;

public class VowelCls {

	public static void main(String[] args) throws InvalidException {

		char c = 'w';
		if ((c == 'a') || (c == 'e') || (c == 'i')|| (c=='o') || (c=='u')) {
			System.out.println("VOWEL");
		} else {
			try {
				throw new InvalidException("Not a VOWEL");
			} finally {
				System.out.println("Alphabet is " + c);
			}
		}

	}

}
