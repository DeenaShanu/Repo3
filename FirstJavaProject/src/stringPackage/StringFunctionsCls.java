package stringPackage;

public class StringFunctionsCls {

	public static void main(String[] args) {
	String s = "Hi";
	String w = "Hi";
	if (s == w) {
		System.out.println("Equalssss");
	}
	String a = new String("Ko");
	String b = new String("Ko");
	if( a == b) {
		System.out.println("Equals");
	}
	String ws = "Good";
	ws = ws.concat("Kill");
	System.out.println(ws);
	StringBuffer bf = new StringBuffer("Welcome School");
	bf.indexOf("Welcome"); 
	System.out.println(bf.indexOf("School"));
	bf.insert(0, "Hi");
	bf.insert(1, "Don");
	System.out.println(bf);
	
	
	}

}
