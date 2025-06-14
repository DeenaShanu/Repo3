package packbuild;

public class StringExamples {

	public static void main(String[] args) {
		StringBuffer varRefObj = new StringBuffer("India");
		StringBuffer varRefObj1 = new StringBuffer("Hello");
		System.out.println(varRefObj);
		varRefObj.append("China");
		System.out.println(varRefObj);
		String a = "Lol";
		System.out.println(a);
		a.concat("pop");
		System.out.println(a);
		System.out.println(varRefObj.insert(5, " Japan "));
		System.out.println(varRefObj1.insert(5, " Japan "));
		StringBuffer nm = new StringBuffer("CarynJack");
		nm.replace(0, 5, "John");
		System.out.println(nm);
		StringBuffer lin = new StringBuffer("CarynJack");
		lin.delete(0, 5);
		System.out.println(lin);
		System.out.println(varRefObj1.reverse());

	}

}
