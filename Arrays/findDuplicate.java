// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.

// Example 1:
// Input: nums = [1,3,4,2,2]
// Output: 2


package Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int n = arr.length;

        int[] count = new int[n];

        for(int i = 0; i<n;i++){
            count[arr[i]]++;

            if(count[arr[i]]>1){
                System.out.println(arr[i]);
            }

        }

        


    }
}
