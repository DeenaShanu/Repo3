package exceptionPackage;

public class NullPointerValueException extends Exception{

	public NullPointerValueException() {
		System.out.println("Exception null");
	}
	public NullPointerValueException(String e) {
		System.out.println(e);
	}

}
