package leetcode75;

public class GuessNumberHigherOrLLower {
	int guess(int num) {
		return 0;
	}
	
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l+(r - l)/2;

            int guessNum = guess(mid);
            if(guessNum == -1){
                r = mid - 1;
            }
            else if(guessNum == 1){
                l = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
