package packbuild;

public class StringBuilderCls {
	public static void main(String args[]) {
	StringBuilder s1 = new StringBuilder("What is yout name?");
	System.out.println("s1===>" + s1);
	s1.append("hi");
	System.out.println("s1===>" + s1);
	String s2 = "hai";
	String h = new String("sun");
	String j = new String("sun");
	System.out.println("s2====> " + s2);
	s2.concat("hello");
	System.out.println("s2====> " + s2);
	System.out.println(s2.concat("hello"));
	System.out.println(s2.length());
	System.out.println(s2.charAt(2));
	int d = 90;
	System.out.println(s2.valueOf(d));
	String g = " ";
	System.out.println("Not empty , space there so "  + g.isEmpty());
	System.out.println(s2.equals("hai"));
	System.out.println(s2.equalsIgnoreCase("Hai"));
	System.out.println(s2 == "hai");
	System.out.println(h == "sun");
	System.out.println(h == j);
	System.out.println("s2----" + s2);
	System.out.println("s1----" + s1);
	System.out.println("jinjam".replace("jin", "jam"));
	System.out.println("s2----" + s2);
	System.out.println("s1----" + s1);
	}
}
