package collectionPack;

import encapsulationPack.EnCap11;

public class EncapOutsidePackCls {

	public static void main(String[] args) {
		EnCap11 obj = new EnCap11();
		obj.setName("Gin");
		obj.setAge(50);
		System.out.println(obj.getName() + " "+ obj.getAge());
		 
		
	}

}
