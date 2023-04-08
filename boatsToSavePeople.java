import java.util.Arrays;

public class boatsToSavePeople {

    public static int minNumberOfBoatsToCarryPeoplons(int[] arr, int boatKiAukaat) {

        // what they want from me is min number of boats to use and carry max amount of
        // people you can.therefore greedy is the solution for me
        // so what can i do is simplee take those numbers of people sort there weights.
        // and i do consider two people one with minWeights. and one with maximum
        // weight. therefore i can simpleee find the count.

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        int count = 0;
        while (i <= j) {
            count++;
            if (arr[i] + arr[j] <= boatKiAukaat) {
                // we increment pointers. because they can be in one boat
                i++;
                j--;
            } else {
                j--;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }

}
