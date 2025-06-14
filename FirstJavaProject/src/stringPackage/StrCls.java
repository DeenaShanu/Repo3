package stringPackage;

public class StrCls {

	public static void main(String[] args) {
	//	String s = "Welcome"; //literal
		
		String s = new String("Welcome");// new keyword
		int strSize = 0;
		strSize = s.length();// to find length
		System.out.println("size == " + strSize);
		
		
		System.out.println(s.charAt(1));//to get the single character from a string
		
		String a = "Sachin";
		String b = a.concat(" Tendulkar");// to modify a string value to another str obj
		String c = " cricket" ;
		System.out.println("a==" + a);
		System.out.println(b);
		c = a.concat("dd");
		System.out.println("c==" + c);
		int ss = 8;
		String var1  = String.valueOf(ss);//converts any data type to string
		System.out.println(var1);
		String name1 = "Sachin" , name2 = "sachin";
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1 == name2);
		String name3 = "Jon", name4 = "Jon";
		System.out.println(name3 == name4);//using literal, same memory location
		String name5 = new String("Jon");
		System.out.println(name3 == name5);
		String dd = " ";
		System.out.println(dd.isEmpty());
		String name10 = "India is our country";//to replace "is" 
		System.out.println(name10.replace("is","was"));
	
		
		
		
		
	}

}
