package collectionPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IteratorCls {

	public static void main(String[] args) {
		HashSet<String> sets = new HashSet<String>();//unordered, not allowed duplicates
		sets.add("One");
		sets.add("Two");
		sets.add("Three");
		sets.add("Four");
		sets.add("Five");
		sets.add("Six");
		sets.add("Six");
		
		System.out.println(sets);
		
		Iterator<String> itr = sets.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println();
		System.out.println(sets);
		///////////////////////////
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("K");
		hSet.add("H");
		hSet.add("G");
		hSet.add("B");
		hSet.add("B");
		Iterator<String> hItr = hSet.iterator();
		while(hItr.hasNext()) {
			System.out.println(hItr.next());
		}
		System.out.println(hSet);
		hItr.remove();
		System.out.println(hSet);
		for(String s : hSet) {
			System.out.println(s);
			
		}
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("hi");
		Iterator<String> it = lists.iterator();
		while(it.hasNext()) {
			it.next();
		}
		
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("Nin");
		lis.add("Lin");
		lis.add("Din");
		lis.add("Pin");
		System.out.println("liss----" + lis);
		Iterator<String> itro = lis.iterator();
		while(itro.hasNext()) {
			System.out.println("Lis iterator---" + itro.next());
		}
		itro.remove();
		System.out.println("Aftr remove--" + lis);
		List<String> refLis = new ArrayList<String>();
		refLis.add("OO");
		refLis.add("PP");
		System.out.println("RefLis----" + refLis);
		Iterator<String> itt = refLis.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		itt.remove();
		System.out.println("Lis remo---" + refLis);
		
	}

}
