package interfacepack1;

public class ImplmntClss implements Intrface,Intface2 {

	public static void main(String[] args) {
		
		ImplmntClss clsObj = new ImplmntClss();
		Intrface intfceObj = new ImplmntClss();
		clsObj.dis();
		
		clsObj.show();
	}

	@Override
	public void dis() {
		System.out.println("Display Imp");
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	

}
