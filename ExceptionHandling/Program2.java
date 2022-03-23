package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter list of values : ");
		String in = br.readLine();
		try {
			String[] a = in.split("\\s");
			int len = a.length;
			System.out.println(a[len - 1]);
			System.out.println(a[len]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
