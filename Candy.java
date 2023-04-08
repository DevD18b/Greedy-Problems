import java.util.Arrays;

public class Candy {
    public static int totalCandy(int[] arr) {
        if (arr.length == 1)
            return 1;
        int total = 0;
        int[] minPossibleChoclate = new int[arr.length];
        Arrays.fill(minPossibleChoclate, 1);
        // we scan from left to right and we only care for one thing and that is about
        // the ratings.
        // of the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                minPossibleChoclate[i] = minPossibleChoclate[i - 1] + 1;
            } else {
                continue;
            }
        }
        // we scan from right to left and we only care about one thing and that is about
        // the the rating.
        // now since we have build the candies array by scanning from left to right.
        // we only care about the about value generated every time we care about the
        // values from
        // right to left.

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                minPossibleChoclate[i] = minPossibleChoclate[i + 1] + 1;
            }
        }

        for (int i : minPossibleChoclate) {
            total += i;
        }
        return total;

    }
}
