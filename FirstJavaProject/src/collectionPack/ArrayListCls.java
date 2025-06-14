package collectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCls {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		List<String> lists = new ArrayList<String>();
//		String name[] = new String[20];
//		System.out.println(name.length);
		
		names.add("Asha");//Since generic, we can add string type data
		names.add("Masha");
		names.add("Nisha");
		System.out.println(names);
		
		names.add(1, "Manju");
		System.out.println(names);
		// to acess or get a value from arrayList
		System.out.println(names.get(2));
		// to replace a value
		names.set(0, "Niya");
		System.out.println(names);
		if (names.contains("Nia")) {
			System.out.println("Element is present");
		} else {
			System.out.println("Not present");
		}
		if (names.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Not empty");
		}
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		names.add("Nisha");
		System.out.println(names);
		
		
		//// for each loop
		ArrayList<String> var = new ArrayList<String>();
		var.add("Pen");
		var.add("Pencil");
		var.add("Book");
//		for (String str : var) {
//			System.out.println(str);
//			
//		}
		
		//iterator
		Iterator<String> var1 = var.iterator();
		while(var1.hasNext()) {
			System.out.println("var1---->" + var1.next());
			
		}
		var1.remove();
		System.out.println(var);
		
		
	}

}
