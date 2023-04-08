import java.util.Arrays;

public class JobSchedulingAsPerDeadLine {

    public static int[] maximumProfitJobsFirst(Jobs[] arr, int n) {

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int countJobs = 0;
        int profitEarned = 0;

        int maxNumberOfSlots = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumberOfSlots < arr[i].deadLine) {
                maxNumberOfSlots = arr[i].deadLine;
            }
        }
        boolean[] availableSlots = new boolean[maxNumberOfSlots];
        Arrays.fill(availableSlots, false);
        for (int i = 0; i < maxNumberOfSlots; i++) {
            for (int j = arr[i].deadLine; j >= 0; j--) {
                if (availableSlots[j] == false) {
                    availableSlots[j] = true;
                    countJobs = 1;
                    profitEarned += arr[i].profit;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = countJobs;
        ans[1] = profitEarned;

        return ans;

    }

}

class Jobs {
    int id;
    int profit;
    int deadLine;
}
