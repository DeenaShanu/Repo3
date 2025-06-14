package collectionPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCls {

	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("Science");
		lists.add("Hindi");
		lists.add("GK");
		
		Iterator<String> itr = lists.iterator() ;
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		
		System.out.println(lists);
		
		
		

	}

}
