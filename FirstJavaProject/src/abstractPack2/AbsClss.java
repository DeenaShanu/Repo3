package abstractPack2;

public abstract class AbsClss {

	int rollNo;
	int age;
	String name;
	String place;
	public abstract void addData();
	
	public void rename(String name) {
		this.name = name;
		
	}
	
}
