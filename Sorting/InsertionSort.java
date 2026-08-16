package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr={3,4,5,2,1};
        int n= arr.length; 

        for (int i = 1; i < n ; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Sorted array:");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
