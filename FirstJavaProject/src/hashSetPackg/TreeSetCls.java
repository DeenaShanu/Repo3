package hashSetPackg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetCls {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("B");
		lists.add("C");
		System.out.println(lists);//ordered and allowed duplicates
		for (String str : lists) {
			System.out.println(str);
			
		}
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Kelvin");
		treeSet.add("Lin");
		treeSet.add("John");
		treeSet.add("John");
		treeSet.add("Linda");
		
		System.out.println(treeSet);
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext() ) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println();
		System.out.println(treeSet);
		System.out.println();
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		

	}

}
