package session.example;

import java.util.Scanner;

public class Ifelse_calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, n;
		System.out.println("---------------------------------------");
		System.out.println("Enter your first value");
		x = sc.nextInt();
		System.out.println("Enter your Second value");
		y = sc.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("Which operation you want to be perform:\n" + "Press 1 for Add\n" + "press 2 for sub\n"
				+ "press 3 for multiply\n" + "press 4 for divide\n" + "press 5 for modulus\n");
		n = sc.nextInt();
		System.out.println("You selected :" + n);

		{
			System.out.println("**************************************");
		}
		if (n == 1) {
			z = x + y;
			System.out.println("your result is : " + z);
		} else if (n == 2) {
			z = x - y;
			System.out.println("your result is :" + z);
		} else if (n == 3) {
			z = x * y;
			System.out.println("your result is :" + z);
		} else if (n == 4) {
			z = x / y;
			System.out.println("your result is :" + z);
		} else if (n == 5) {
			z = x % y;
			System.out.println("your result is :" + z);
		} else {
			System.out.println("wrong input");
		}
		{
			System.out.println("**************************************");
		}
		{
			System.out.println("Thank You");
			System.out.println("\n*********Programmed by S.Bhushan*********");
		}
		sc.close();

	}
}