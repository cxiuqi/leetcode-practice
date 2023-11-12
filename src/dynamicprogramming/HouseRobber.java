package dynamicprogramming;

public class HouseRobber {

	public static void main(String[] args) {
		System.out.println(rob(new int[] {1,2,3,1}));
		System.out.println(rob(new int[] {2,7,9,3,1}));
	}
	
	public static int rob(int[] nums) {
        int size = nums.length;
        int money[] = new int[size + 1];
        money[0] = nums[0];
        if(size > 1){
            money[1] = nums[1];
        }
        if(size > 2){
            money[2] = nums[0] + nums[2];
            for(int i = 3; i < size; i++){
                money[i] = Math.max(money[i-2], money[i-3]) + nums[i];
            }
            money[size] = Math.max(money[size-1], money[size-2]);
        }
        if(size == 2){
            return Math.max(money[1], money[0]);
        }
        if(size == 1){
            return money[0];
        }
        return money[size];
    }

}
