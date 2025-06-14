package accessSpecifierPack;

public class AccessSpecCls {

	public static void main(String[] args) {
		AccessSpecCls accObj = new AccessSpecCls();
		accObj.displayPrivate();
		accObj.doDefault();
		accObj.printProtected();
		accObj.showPublic();

	}
	public void showPublic() {
		System.out.println("Public show");
	}
	private void displayPrivate() {
		System.out.println("displayPrivate");
	}
	protected void printProtected() {
		System.out.println("printProtected");
	}
	 void doDefault() {
		System.out.println("doDefault");
	}

}
