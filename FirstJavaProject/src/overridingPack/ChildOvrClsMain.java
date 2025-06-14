package overridingPack;

public class ChildOvrClsMain extends ParentClsOvr {

	public static void main(String[] args) {
		ChildOvrClsMain obj = new ChildOvrClsMain();
		obj.show(100);

	}
	public void show(int c) {
		super.show(200);
		System.out.println("Child=" + c);
	}
}
