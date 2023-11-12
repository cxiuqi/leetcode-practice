package dynamicprogramming;

public class NthTribonacciNumber {

	public static void main(String[] args) {
		System.out.println(tribonacci(4));
		System.out.println(tribonacci(25));
	}

	public static int tribonacci(int n) {
        int f[] = new int[n+2]; 
        f[0] = 0;
        f[1] = 1;        
        if(n <= 1){
            return f[n];
        }
        f[2] = 1;
        if(n == 2){
            return 1;
        }
        for(int i = 3; i < n + 1; i++){
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }
        return f[n];
    }
}
