import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (Integer.compare(a[0], b[0])));
        List<int[]> ans = new ArrayList<>();
        if (intervals.length == 0) {
            return ans.toArray(new int[0][]);
        }
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] arr : intervals) {
            if (arr[0] <= end) {
                end = Math.max(end, arr[1]);
            } else {
                ans.add(new int[] { start, end });
                start = arr[0];
                end = arr[1];
            }
        }
        ans.add(new int[] { start, end });
        return ans.toArray(new int[ans.size()][]);
    }
}
