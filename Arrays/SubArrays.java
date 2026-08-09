package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int [] arr = {1,3,2,6,5,7,9} ;
    
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}
