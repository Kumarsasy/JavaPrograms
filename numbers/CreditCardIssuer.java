package numbers;

import java.util.Scanner;

public class CreditCardIssuer {
	public static void main(String[] args) {
		System.out.println("Enter a credit score: ");
		Scanner scanner = new Scanner(System.in);
		int creditScore = scanner.nextInt();
		if (creditScore < 400 || creditScore > 850) {
			System.out.println("Invalid Credit Score");
		} else {
			if (creditScore >= 400 && creditScore < 600) {
				System.out.println("Silver Card");
			} else if (creditScore >= 600 && creditScore < 800) {
				System.out.println("Gold Card");
			} else {
				System.out.println("Platinum Card");
			}
		}
		scanner.close();
	}
}

/*
 * 400 to 600 - Silver card 600 to 800 Gold card 800 to 850 Platinum card
 */