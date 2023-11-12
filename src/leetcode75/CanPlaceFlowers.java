package leetcode75;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
		System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i += 2){
            if(i != flowerbed.length - 1 && flowerbed[i+1] == 1){
                i++;
            }
            else if(flowerbed[i] == 0){
                n--;
                if(n == 0){
                    return true;
                }
            }
        }
        return n <= 0;
    }
	
	public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
	     int plantable = 0;
	     if(flowerbed.length > 1){
	         for(int i = 0; i < flowerbed.length; i++){
	             if(flowerbed[i] == 0){
	                 if(i == 0){
	                     if(flowerbed[i+1] == 0){
	                         flowerbed[i] = 1;
	                         plantable += 1;
	                     }
	                 }
	                 else if (i == flowerbed.length-1){
	                     if(flowerbed[i-1] == 0){
	                         flowerbed[i] = 1;
	                         plantable += 1;
	                     }
	                 }
	                 else{
	                     if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
	                         flowerbed[i] = 1;
	                         plantable += 1;
	                     }
	                 }
	             }
	         }
	     }
	     else{
	         if(flowerbed[0] == 0){
	             plantable += 1;
	         }
	     }
	     return (n <= plantable);
	}
}
