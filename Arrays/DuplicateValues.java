package Arrays;

public class DuplicateValues {
    public static boolean Duplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4,2, 5, 6, 8, -8};
        boolean result = Duplicate(arr);

        System.out.println(result);
    }
}
