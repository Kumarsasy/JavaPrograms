package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ConsecutiveCharFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		boolean found = false;
		
		for(int i=0; i< input.length()-1;i++) {
			if(input.charAt(i) == input.charAt(i + 1)) {
				found = true;
				break;
			}
		}
		
		System.out.println("Found");

		scanner.close();
	}
}
