package pack3;

public class SamMavCls {

	public static void main(String[] args) {
		int num = 6;
		int exp = num % 2;
		switch (exp) {
		case 0 : System.out.println("EVEN"); break;
		case 1 : System.out.println("ODD"); break;
		default : System.out.println("Invalid");
		}

	}

}
