package numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), result = 0;
		
		while(num !=0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse number " + result);
		scanner.close();
	}
}

/*
num 
12345
1234
123
12
1

digit
5
4
3
2
1

result=0
5
50+4 = 54
540+3 = 543
5430+2 = 5432
54320+1 = 54321
*/