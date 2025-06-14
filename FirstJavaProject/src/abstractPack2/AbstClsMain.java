package abstractPack2;

import java.util.ArrayList;
import java.util.List;

public class AbstClsMain extends AbstCls {

	public static void main(String[] args) {
		AbstCls obj = new AbstClsMain();
		AbstClsMain obj1= new AbstClsMain();
		obj.show();
		obj1.display();
		List<String> lists = new ArrayList<String>();
		lists.add("Table");
		lists.add("Desk");
		lists.add("Board");
		lists.add("table");
		System.out.println(lists);
		System.out.println(lists.indexOf("Desk"));
		System.out.println(lists.lastIndexOf("table"));
		System.out.println(lists);
		lists.remove(1);
		System.out.println(lists);
		if(lists.contains("Board")) {
			System.out.println("Exists");
		}
		
		

	}

	@Override
	public void show() {
	System.out.println("Show");
	
		
	}
	public void display() {
		System.out.println("Display");
	}
	
	

}
