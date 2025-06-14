package accessSpecifierPack;

public class AccessSPecOne {

	public static void main(String[] args) {
		AccessSpecCls obj=new AccessSpecCls();
		obj.doDefault();
		obj.showPublic();
		obj.printProtected();
		//obj.displayPrivate(); 
	}

}
