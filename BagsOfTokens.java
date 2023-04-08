import java.util.Arrays;

public class BagsOfTokens {
    public static int maximumTokens(int[] tokens, int power) {

        Arrays.sort(tokens);

        // we need to maximize the total score.
        int left = 0;
        int right = tokens.length - 1;
        int ans = Integer.MIN_VALUE;
        int score = 0;

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                ans = Math.max(ans, score);
            } else {
                if (score >= 1) {
                    power += tokens[right];
                    score--;
                    right--;

                } else {
                    break;
                }
            }
        }
        return ans;

    }

}
