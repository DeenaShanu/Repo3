package collectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleCollection {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("One");
		lists.add("Two");
		lists.add("Three");
		lists.add("Four");
		lists.add("Five");
		System.out.println(lists);
//		Iterator<String> itr = lists.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for (String r : lists) {
			System.out.println(r);
		}

	}

}
