package strings;

import java.util.Scanner;

public class VowelConsonantCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		int vcount =0, ccount = 0;		
		
		for(int i=0 ; i< input.length();i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				vcount++;
			} else {
				ccount++;
			}
		}
		System.out.println("Vowel count " + vcount);
		System.out.println("Consonant count " + ccount);
		
		
		
		scanner.close();
	}
}
