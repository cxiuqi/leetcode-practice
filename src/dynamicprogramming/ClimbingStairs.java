package dynamicprogramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(3));
	}
	
	public static int climbStairs(int n) {
        int steps[] = new int[n + 2];
        steps[0] = 1;
        steps[1] = 1;
        for(int i = 2; i <= n; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }
}
