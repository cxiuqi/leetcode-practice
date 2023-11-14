package leetcode75;

import java.util.Stack;

public class AsteroidCollision {

	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        for(int i = 1; i < asteroids.length; i++){
            if(asteroids[i] > 0 || st.empty()){ // same sign
                st.push(asteroids[i]);
            }
            else{ // different sign collide
                while(true){
                    int peek = st.peek();
                    if(peek<0){
                        st.push(asteroids[i]);
                        break;
                    }else if(peek == -asteroids[i]){
                        st.pop();
                        break;
                    }else if(peek > -asteroids[i]){
                        break;
                    }else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int result[] = new int[st.size()];
        for(int i = st.size()-1; i >= 0; i--){
            result[i] = st.pop();
        }
        return result;
    }
}
