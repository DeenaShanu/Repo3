package encapsulationPack;

public class Encap2Cls {

	public static void main(String[] args) {
		EncapA obj = new EncapA();
		obj.setBankId(101);//since bankId is a private variable(which is
		//encapsulated(hiding as private) in a class EncapA), but here we can view and
		// modify its value through getter(view) and setter(modify) method
		System.out.println(obj.getBankId());

	}

}
