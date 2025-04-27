package numbers;

import java.util.Scanner;

public class IntegerToBinary {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] binary = new int[10];
		int i = 0;
		while(num!=0) {
			binary[i] = num%2;
			num = num/2;
			i++;
		}
		
		for(int j = i-1; j>=0;j--) {
			System.out.print(binary[j]);
		}
		// System.out.println("Integer to Binary " + Integer.toBinaryString(num));
	}
}

/*
9
divide		remainder
9/2			9%2 = 1
4/2			4%2 = 0
2/2			2%2 = 0
1/2			1%2 = 1
0
*/
