package stringPackage;

public class StringsClss {

	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer("Welcome");
		bf.insert(0, "MAryam");
		System.out.println(bf);
		System.out.println(bf.indexOf("Welcome"));
		bf.insert(6, "Cool");
		System.out.println(bf);
		//bf.delete(0, 6);
		System.out.println(bf);
	//	bf.append("Keep");
		System.out.println(bf);
		//bf.reverse();
		System.out.println(bf);
		bf.replace(0, 6, "MARYAM");
		System.out.println(bf);
		

	}

}
