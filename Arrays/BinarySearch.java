package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8};
        int key = 8;
        int start  = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==key){
                System.out.println("element found at " + mid);
                return;
            }
            if(arr[mid]<key){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }

        System.out.println("not found");
    }
}
