import java.util.Stack;

public class MaxAreaInHistogram {

    public static void maxArea(int[] height) {
        int maxArea = 0;
        int[] nsr = new int[height.length];
        int[] nsl = new int[height.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = height.length -1; i >= 0 ; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next Smaller left
        s = new Stack<>();

        for (int i = 0; i < height.length ; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Current Area
        //width = j - i -1 = nsr[i] - nsl[i] -1
        for (int i = 0; i < height.length; i++) {
            int heights = height[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = heights * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Maximum area in the histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int height[] = {2, 1, 5, 6, 2, 3};
        maxArea(height);
    }
}
