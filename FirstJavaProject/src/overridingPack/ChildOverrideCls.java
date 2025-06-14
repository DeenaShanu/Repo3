package overridingPack;

public class ChildOverrideCls extends ParentOverrideCls{

	public static void main(String[] args) {
		ChildOverrideCls obj = new ChildOverrideCls();
		obj.display(3);

	}
	public void display(int a) {
		super.display(8);
		System.out.println("child class display" + a);
	}

}
