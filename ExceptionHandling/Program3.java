package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the age of voter : ");
		String in = br.readLine();
		try {
			int age = Integer.parseInt(in);
			if (age < 18) {
				throw new OwnException();
			} else {
				System.out.println("Voter is eligible");
			}
		} catch (OwnException e) {
			e.message();
		}

	}

}
