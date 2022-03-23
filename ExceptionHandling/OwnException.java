package exceptionHandling;

public class OwnException extends Exception {

	public void message() {
		System.out.println("Not Eligible : Voter age must be equal or greater than 18");
	}
}
