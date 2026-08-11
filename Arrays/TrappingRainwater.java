package Arrays;

public class TrappingRainwater {
     public static int TrappedRainwater(int[] height) {

        int n = height.length;

        //leftmax boundary array
        int[] leftMax = new int [n];
        leftMax[0] = height[0];

        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //rightMax boundary Array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        
        for(int i = (n-2); i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //Trapped Rainwater
        int trappedRainwater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedRainwater += waterLevel - height[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,0,3,1,0,1,3,2,1};
        int result = TrappedRainwater(arr);

        System.out.println(result);
    }
}


