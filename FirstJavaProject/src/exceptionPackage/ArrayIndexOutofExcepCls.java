package exceptionPackage;

public class ArrayIndexOutofExcepCls {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		try {
			for(int i = 0; i <=7; i++) {
		
			System.out.println(arr[i]);
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hi");

	}

}
