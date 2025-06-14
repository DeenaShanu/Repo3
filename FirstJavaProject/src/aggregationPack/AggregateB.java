package aggregationPack;

public class AggregateB {
	int id ;
	String name;
	AggregateA obj;
	public static void main(String[] args) 
	{
		
		AggregateA sc=new AggregateA("ABCD","Kollam","kerala",897654);
		AggregateB hg=new AggregateB(123,"Dheena",sc);
		hg.show();
	}
	public AggregateB(int id, String name, AggregateA obj) {
		
		this.id = id;
		this.name = name;
		this.obj = obj;
	}
	public void show()
	{
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Address : "+obj.addressName+" "+obj.city+" "+obj.state+" "+obj.pincod);
	}
	

	
	

}
