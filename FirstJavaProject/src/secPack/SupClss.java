package secPack;

public class SupClss {

	public static void main(String[] args) {
		
		SupClss dObj = new SupClss();
		dObj.privateA();
	}
	private void privateA() {
		System.out.println("private method");
	}
	protected void protectA() {
		System.out.println("Protected method");
	}
	public void publicA() {
		System.out.println("Public method");
	}
	void defaultA() {
		System.out.println("default  method");
	}

}
