package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value of a & b : ");
		String in = br.readLine();
		try {
			String[] a = in.split("\\s");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			System.out.println("The value of a/b = " + x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
