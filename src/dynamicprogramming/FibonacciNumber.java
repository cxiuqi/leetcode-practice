package dynamicprogramming;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
	}
	
	public static int fib(int n) {
		int val[] = new int[n+2];
		val[0] = 0;
		val[1] = 1;
		for(int i = 2; i <= n; i++){
			val[i] = val[i-1] + val[i-2];
		}
		return val[n];
	}

}
