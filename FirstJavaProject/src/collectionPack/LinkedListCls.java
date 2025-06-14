package collectionPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListCls {

	public static void main(String[] args) {
	LinkedList<String> names = new LinkedList<String>();
	List<String> lists = new LinkedList<String>();
	Set <String> nameSets = new HashSet<String>();
	nameSets.add("Divas");
	nameSets.add("Mannal");
	nameSets.add("Kripa");
	System.out.println("nameSets-----" + nameSets);
	Iterator <String> itr = nameSets.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	itr.remove();
	System.out.println(nameSets);
	names.add("Fida");
	System.out.println(names);
	names.add("Ritu");
	names.add("Olive");
	System.out.println(names);
	names.set(0, "Kripa");
	System.out.println(names);
	try {
	System.out.println(names.get(4));
	} catch (IndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	
	
	ArrayList<Integer> nums = new ArrayList<Integer>();
	nums.add(90);
	System.out.println(nums);
	
	}

}
