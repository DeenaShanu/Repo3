package samplepackage;

public class Grade {

	public static void main(String[] args) {
		
		int sub1 = 50;
		int sub2= 40;
		int sum = sub1+ sub2;
		if (sum < 40) {
			System.out.println("FAILED");
		} else if(sum >= 40 && sum <=60) {
			System.out.println("Grade D");
		} else if(sum >= 61 && sum <=70) {
			System.out.println("Grade C");
		} else if(sum >= 71 && sum <=80) {
			System.out.println("Grade B");
		} else if(sum >= 81 && sum <=100) {
			System.out.println("Grade A");
		}
	}

}
