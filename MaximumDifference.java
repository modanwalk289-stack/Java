public class MaximumDifference {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int min = arr[0];
        int maxDiff = 0;

        for (int i = 1; i < arr.length; i++) {

            int difference = arr[i] - min;

            if (difference > maxDiff) {
                maxDiff = difference;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Difference = " + maxDiff);
    }
}