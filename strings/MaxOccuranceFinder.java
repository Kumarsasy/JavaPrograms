package strings;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccuranceFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		int arr[] = new int[256];

		for (int i = 0; i < input.length(); i++) {
			arr[(int) input.charAt(i)]++;
		}

		int m = 0;

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > arr[m]) {
				m = j;
			}
		}

		System.out.println("Max occuring character is : " + (char) m);
		
		String str = "sample string";
        System.out.println("Max occurring character is: " + getMaxOccurringChar(str));

		scanner.close();
	}

	// function that returns maximum occurring character
	static char getMaxOccurringChar(String str) {

		// create HashMap to store frequency of every character
		HashMap<Character, Integer> mp = new HashMap<>();

		// to store length of string
		int n = str.length();

		// to store answer
		char ans = 0;

		// to check count of answer character is less or greater
		// than another elements count
		int cnt = 0;

		// traverse the string
		for (int i = 0; i < n; i++) {

			// push element into map and increase its frequency
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);

			// update answer and count
			if (cnt < mp.get(c)) {
				ans = c;
				cnt = mp.get(c);
			}
		}

		return ans;
	}
}
