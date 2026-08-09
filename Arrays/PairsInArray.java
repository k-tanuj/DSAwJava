package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int [] arr = {1,3,2,6,5,7,9};

        for(int i =0;i<arr.length;i++){
            int pointer = arr[i];
            for (int j = i+1;j<arr.length;j++){
                System.out.print("("+pointer+","+arr[j]+") ");
            }
        System.out.println();
        }
    }
}
