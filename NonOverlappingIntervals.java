import java.util.Arrays;

public class NonOverlappingIntervals {

    public static int countNonOverlappingInterval(int[][] intervals) {
        // [0] --> start time.
        // [1] -- end. time.

        // [[1,2],[2,3],[3,4],[1,3]] --> after sorting --> it looks like -->
        // [1,2],[2,3],[1,3][3,4];

        Arrays.sort(intervals, (a, b) -> {
            if (a[1] > b[1])
                return 1;
            else if (a[1] == b[1])
                return 0;
            else
                return -1;
        });
        // acha so now i need to find out kiii.
        // kab kab intervals overlappe ho rahe hongeee.
        int count = 1;

        int currentEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= currentEnd) {
                currentEnd = intervals[i][1];
                count += 1;
            }
        }
        return intervals.length - count;

    }

}
