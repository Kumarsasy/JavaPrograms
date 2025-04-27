package patterns;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {

		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println("Square Pattern");
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("IncreasingTraingle Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Decreasing Traingle Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Right Traingle Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Left Traingle Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("Pascals Traingle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println("Inverse Pascals Traingle");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Hill Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j < i; j++) {
				System.out.print("*" + " ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Reverse Hill Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			for (int j = i; j < n; j++) {
				System.out.print("*" + " ");
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("Sand Glass");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			for (int j = i; j < n; j++) {
				System.out.print("*" + " ");
			}
			
			for (int j = i; j <= n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j < i; j++) {
				System.out.print("*" + " ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}

/*
=====   =====   =====   =====   =====   =====   =====   =====   =====

Right Traingle, Left Traingle, Hill Pattern, Reverse Hill Pattern
are made from combination of these two patterns.
Increasing Traingle, Decreasing Traingle Patterns 

Right Traingle:-
	1- Decreasing traingle of space
	2- Increasing traingle of star

Left Traingle:-
	1- Increasing traingle of space
	2- Decreasing traingle of star

Pascals Traingle
	1- Increasing traingle of star
	2- Decreasing traingle of star
	
Reverse Pascals Traingle
	1- Decreasing traingle of space
	2- Increasing traingle of star
	
	3- Increasing traingle of space
	4- Decreasing traingle of star

Hill Pattern:-
	1- Decreasing traingle of space
	2- Increasing traingle of star
	3- Increasing traingle of star

Reverse Hill Pattern:-
	1- Increasing traingle of space
	2- Decreasing traingle of star
	3- Decreasing traingle of star
	
Sand Glass
	1- Increasing traingle of space
	2- Decreasing traingle of star
	3- Decreasing traingle of star
	
	4- Decreasing traingle of space
	5- Increasing traingle of star
	6- Increasing traingle of star


=====   =====   =====   =====   =====   =====   =====   =====   =====
*/
