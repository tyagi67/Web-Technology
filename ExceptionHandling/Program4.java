package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter values of a & b : ");
		try {
			String[] in = br.readLine().split("\\s");

			// NumberFormatException
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			System.out.println("The value of a/b = " + a / b);

			// ArrayIndexOutOfBoundsException
			System.out.println(in[in.length - 1]);

			// NullPointerException
			String s = null;
			System.out.println(s.length());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}

	}

}
