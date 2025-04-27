package recursion;

public class FactorialNumber {
	
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}

/*
factorial(3) = 3*2*1
factorial(3) = 3*factorial(2)
factorial(2) = 2*factorial(1)
factorial(1) = 1*factorial(0)
factorial(0) = 1

factorial(n) = n*factorial(n-1)


def factorial(n)
	if( n==0
	  return 1
	else
	  return n*factorial(n-1)
*/
