package samplepackage;

public class FibinocciCls {

	public static void main(String[] args) {
//		int a[] = new int[10];
//		 a[0] = 0;
//		 a[1] = 1;
//		 a[2] = a[0] + a[1];
//		 System.out.print(a[0] + " " + a[1] + " " +a[2] + " ");
//		for (int i = 2; i <= 5; i++) {
//			a[i +1] =  a[i-1] + a[i];
//			System.out.print(a[i+1] + " ");
//			}
		
//		int num=345;
//		int rev = 0;
//		int mod = 0;
//		while (num > 0 ) {
//			mod = num%10;
//			num = num/10;
//			rev  = rev * 10 + mod;
//		}
//		System.out.println("Reverse = " +  rev);
		int a[] = {10,11,12,13,14,15,16,17,18,19,20};
		int cntEven = 0;
		int cntOdd = 0;
		for (int i =0; i< 10;i++) {
			if (a[i] % 2 == 0) {
				cntEven++;
			} else {
				cntOdd++;
			}
		}
		System.out.println("Even numbers are " + cntEven);
		System.out.println("Odd numbers are " + cntOdd);
		
	}

}
