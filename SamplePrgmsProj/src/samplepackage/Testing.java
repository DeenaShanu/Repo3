package samplepackage;

import java.util.ArrayList;

public class Testing {

	public static void main(String[] args) {
		String a[]= new String[5];
		String b = "hello";
		String d= new String("hello");
		ArrayList<String> li = new ArrayList<String>();

		for (int i = 1; i <= 5; i++) {
			if(i ==5) {
				break;
			}
			a[i] = "hima";
			li.add("kim");
			System.out.println(a[i]);
			System.out.println(li);
			
		}
		System.out.println("Hi");
	}

}
