package Arrays;

public class LinearSearch {

    public static void main(String args[]) {

        int[] num = {2, 4, 6, 8, 10, 5, 16, 15, 24, 19};
        int key = 5;

        for (int i = 0; i < num.length; i++) {

            if (num[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}