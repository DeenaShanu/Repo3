package exceptionPackage;

public class VotingExcp {

	public static void main(String[] args) throws VotingException {
		int age = 8;
		
		if (age >= 18) {
			System.out.println("Eligble for voting");
			} else {
			
				//try 
					throw new VotingException(" not eligible");//constructor
				//} finally {
				//System.out.println("Age " +  age);
				//	}
				}
		}
	}


