package samplepackage;

public class Fact {

	public static void main(String[] args) {
		Fact obj = new Fact();
		obj.factorial(4);
		obj.palindrome(1001);



	}

	public void factorial(int num) {
		int fact =1;
		
		for (int i =1;i <= num ;i++) {
			fact = fact*i;
		}
		System.out.println("FAct = " + fact);
	}
	public void palindrome(int num) {
		int number= num;
		int rev = 0;
		while (num>0 ) {
			rev = rev *  10 + num%10;
			num = num/10;
		}
		System.out.println("Rev= "+  rev);
		if (rev == number) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT a PALINDOME");
		}
	}
}
