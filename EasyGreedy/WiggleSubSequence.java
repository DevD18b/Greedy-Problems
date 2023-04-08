public class WiggleSubSequence {

    public static int maxlengthOfWiggleSubSeq(int[] nums) {

        if (nums.length < 2)
            return 0;
        int prevDiff = 0;

        prevDiff = nums[1] - nums[0];

        int count = prevDiff != 0 ? 2 : 1;
        for (int i = 2; i < nums.length; i++) {

            int diff = nums[i] - nums[i - 1];
            if (prevDiff < 0 && diff > 0) {
                count++;
                prevDiff = diff;
            } else if (prevDiff > 0 && diff < 0) {
                count++;
                prevDiff = diff;
            }
            // for cases when both are either positive or both are either
            // negative we do nothing.

        }

    }
}