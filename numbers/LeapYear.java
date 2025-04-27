package numbers;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a year: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap year");
		}
		scanner.close();
	}
}

/*
 * Leap Year year%4==0 , year%400==0
 * 
 * Not a Leap year year%100!=0
 */