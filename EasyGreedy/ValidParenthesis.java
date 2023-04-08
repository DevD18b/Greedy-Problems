package EasyGreedy;

public class ValidParenthesis {

    public static boolean validiation(String str) {
        // when we can ignore the * cases.
        // when open == closed.
        // when open is more in number then closed. then * is there
        // to balance.
        // vice versa for the close bracket.

        int open = 0;
        int close = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '*') {
                open++;
            } else {
                open--;
            }
            if (open < 0)
                return false;
        }
        if (open == 0)
            return true;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ')' || str.charAt(i) == '*') {
                close++;
            } else {
                close--;
            }
            if (close < 0)
                return false;
        }

        return true;

    }
}
