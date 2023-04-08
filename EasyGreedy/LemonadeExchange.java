package EasyGreedy;

public class LemonadeExchange {
    // mere pass 5 10 20 keh coins aah rahe honge
    // ek static stream keh form meh.
    // what i need to do is find out weather at every single point cna
    // i able to return the change.
    public static boolean returnChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five++;
            }
            if (i == 10) {
                five--;
                ten++;
            } else {
                if (ten == 0) {
                    if (five < 3) {
                        return false;
                    }
                    five -= 3;
                } else {
                    if (five == 0)
                        return false;
                    five--;
                    ten--;
                }
            }
        }
        return false;
    }
}
