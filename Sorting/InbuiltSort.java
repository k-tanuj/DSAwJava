package Sorting;
import java.util.Arrays;
public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1};

        Arrays.sort(arr,0,4);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
