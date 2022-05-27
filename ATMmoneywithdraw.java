package session.example;

import java.util.Scanner;

public class ATMmoneywithdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Note : Kindly Enter Your Amount Between 100 to 20000");
		System.out.println("----------------------------------------------------");
		System.out.println();
		int a;
		System.out.println("Enter Your Amount Want To Withdraw");
		a = sc.nextInt();
		if (a >= 100) {
			if (a <= 20000) {
				System.out.println();
				System.out.println("You Have Successfully Withdrawn Your Amount :" + a + "/-");
			} else {
				System.out.println();
				System.out.println("Please Enter Valid Number\n" + "This Amount is not valid between 100 to 20000");
			}
		} else {
			System.out.println(
					"Please Enter Valid Number\n" + "This Amount is not valid between 100 to 20000\n" + "Try Again");
		}
		System.out.println("\n*********Programmed by S.Bhushan*********");
		sc.close();
	}
}