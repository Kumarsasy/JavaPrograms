package arrays;

import java.util.Scanner;

public class ArrayFromUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		scanner.close();
	}
}
