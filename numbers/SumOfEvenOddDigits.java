package numbers;

import java.util.Scanner;

public class SumOfEvenOddDigits{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sumEven = 0, sumOdd = 0;
		
		while(num !=0) {
			digit = num % 10;
			if(digit%2==0) {
				sumEven = sumEven + digit;
			} else {
				sumOdd = sumOdd + digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of Even digits: " + sumEven);
		System.out.println("Sum of Odd digits: " + sumOdd);
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
*/