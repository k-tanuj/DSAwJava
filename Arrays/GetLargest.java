package Arrays;

public class GetLargest {
    public static void main(String [] args){
        int[] num = {2, 4, 6, 8, 10, 5, 16, 15, 24, 19};
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
    
}
