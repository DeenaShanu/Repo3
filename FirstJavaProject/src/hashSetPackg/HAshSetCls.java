package hashSetPackg;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HAshSetCls {

	public static void main(String[] args) {
		HashSet<String> var = new HashSet<String>();
		HashSet<String> varSec = new HashSet<String>();
	//	Set<String> var1 = new HashSet<String>();//another way of initialization
		//Set is an interface, we can create a refObj since interface has no constructor and cant
		// create object
		
		var.add("Lin");
		var.add("Kin");
		var.add("Lol");
		
		varSec.add("Man");
		varSec.add("Girl");
		varSec.add("Child");
		var.addAll(varSec);
		
		
		System.out.println(var);
		System.out.println();
		System.out.println(varSec);
		
		System.out.println("Display");
		System.out.println();
		for (String b : var) {
			System.out.println(b);
		}
		System.out.println("Displayyy");
		Iterator<String> itr = var.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(var);
		

	
		

	}

}
