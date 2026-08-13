import java.util.Arrays;

public class LongestSequence {

    public static void main(String[] args) {

        int[] arr = {1, 9, 3, 10, 4, 20, 2};

        Arrays.sort(arr);

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            }
            else if (arr[i] == arr[i - 1]) {
                continue;
            }
            else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Longest Sequence Length = " + maxCount);
    }
}