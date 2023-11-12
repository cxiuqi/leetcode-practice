package leetcode75;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
		System.out.println(maxArea(new int[] {1,1}));
	}
	
    public static int maxArea(int[] height) {
        int max = 0;
        int j = height.length - 1;
        int i = 0;
        while(j > i){
            int area = Math.min(height[i], height[j]) * (j-i);
            if(height[j] < height[i] && j > 0){
                j--;
            }else{
                i++;
            }
            if(max < area){
                max = area;
            }
        }
        return max;
    }
}
