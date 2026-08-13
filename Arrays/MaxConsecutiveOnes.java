package Arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int res = 0;

        for (int i = 0; i < n; i++) {

            int cnt = 0;

            for (int j = i; j < n; j++) {

                if (nums[j] == 0)
                    break;

                cnt++;
            }

            res = Math.max(res, cnt);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};

        int result = findMaxConsecutiveOnes(arr);

        System.out.println(result);
    }
}