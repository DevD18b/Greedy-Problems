package EasyGreedy;

import java.util.*;

public class CoinMinimization {

    static int[] arr = { 2, 5, 10, 20, 50, 100, 500, 2000 };

    // 85 --> 50+30+5. in greeedy.
    // other wise its kind of 2upto 40 coins then +1*5.
    public static List<Integer> find(int cash) {
        List<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (cash >= arr[i]) {
                cash -= arr[i];
                list.add(arr[i]);
            }
        }
        return list;

    }

}
