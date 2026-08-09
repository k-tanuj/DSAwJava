package Arrays;

public class MaxSubArraySumBrute {
    public static void main(String[] args) {
        int [] arr = {1,3,2,6,5,7,9};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                currSum = 0 ;
                for(int k = i;k<=j;k++){
                    currSum += arr[k];
            }
            System.out.println("currSum at iteration "+ i + "." +j+ " : "+ currSum);
            if (currSum>maxSum)
                maxSum = currSum;
            
        }
    }
        System.out.println("maxSum: "+maxSum);
}
        
}

