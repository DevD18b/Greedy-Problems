import java.nio.charset.CoderResult;
import java.util.Arrays;

public class MinArrowsRequiredToBrustTheBallon {

    public static int countArrowToBrustTheBallon(int[][] coordinates) {

        int minArrow = 1;

        Arrays.sort(coordinates, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int currentEnd = coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            if (currentEnd < coordinates[i][0]) {
                minArrow += 1;
                currentEnd += coordinates[i][1];
            }
        }
        return minArrow;

    }
}
