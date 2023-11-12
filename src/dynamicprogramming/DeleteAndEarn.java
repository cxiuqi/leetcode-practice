package dynamicprogramming;

public class DeleteAndEarn {
	
	public static void main(String[] args) {
		System.out.println(deleteAndEarn(new int[] {3,4,2}));
		System.out.println(deleteAndEarn(new int[] {2,2,3,3,3,4}));
	}

	public static int deleteAndEarn(int[] nums) {
        int maxNum = 0;
        for(int n: nums) {
            maxNum = Math.max(n, maxNum);
        }
        int money[] = new int[maxNum + 1];

        for(int i = 0; i < nums.length; i++){
            money[nums[i]] += nums[i];
        }

        for(int i = 2; i < money.length; i++){
            money[i] = Math.max(money[i-2] + money[i], money[i-1]);
        }
        return money[money.length-1];
    }
}
