package arrays;

import java.util.Scanner;

public class OddIndexElem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < arr.length; i = i + 2) {
			System.err.print(arr[i] + " ");
		}

	}
}