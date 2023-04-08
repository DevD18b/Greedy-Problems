public class GasStations {

    public static int isPossibleToReach(int[] gas, int[] cost) {
        // we have initial fuel as zero.
        // case 1 we are cost money for refuling = gas[i]-cost[i];
        // if it becomes negative it means we dont have enough
        // money. so we need to try for next index.
        int totalFuel = 0;
        int totalCost = 0;
        for (int i : gas) {
            totalFuel += i;
        }
        for (int j : cost) {
            totalCost += j;
        }
        if (totalFuel < totalCost)
            return -1;
        int validPosition = 0;
        int currentFuel = 0;
        for (int i = 0; i < gas.length; i++) {
            currentFuel += (gas[i] - cost[i]);
            if (currentFuel < 0) {
                currentFuel = 0;
                validPosition = i + 1;
            }
        }
        return validPosition;

    }

    public static void main(String[] args) {

    }
}