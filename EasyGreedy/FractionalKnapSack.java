package EasyGreedy;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class itemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double r1 = (double) (a.value) / (double) (a.weight);
        double r2 = (double) (b.value) / (double) (b.weight);
        if (r1 < r2)
            return 1;
        else if (r1 > r2)
            return -1;
        else
            return 0;
    }
}

public class FractionalKnapSack {

    // here we need to maximize the profit.
    // there we need to consider all those values.
    // which is heaving higher values of value by weight.

    public static int earnMaxProfit(Item[] arr, int bagCap, int n) {

        Arrays.sort(arr, new itemComparator());
        int currentWeight = 0;
        int finalProfit = 0;
        for (int i = 0; i < n; i++) {
            if (currentWeight + arr[i].weight <= bagCap) {
                finalProfit += arr[i].value;
                currentWeight += arr[i].weight;
            } else {
                int remain = bagCap - currentWeight;
                finalProfit += (double) ((arr[i].value) / (arr[i].weight)) * remain;
            }
        }
        return finalProfit;

    }
}
