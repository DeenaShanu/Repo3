package outsideAccessPack;

import accessSpecifierPack.AcceesSpecCls;

public class OutsideAccCls extends AcceesSpecCls{

	public static void main(String[] args) {
		OutsideAccCls obj = new OutsideAccCls();
		obj.protectA();
		obj.publicA();
		
	}

}
