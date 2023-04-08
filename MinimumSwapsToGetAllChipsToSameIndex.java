
public class MinimumSwapsToGetAllChipsToSameIndex {

    public static int find(int[] arr, int n) {
        // arr = {2,2,2,3,3}
        // it means at second index --> 2 we have 3 coins.
        // it means at thirs index we have 2 coins.
        // so what i need to find out is how to bring them at equal index.

        // suppose i am at index 10,000 i can easily bring it to index 2 at cost =0;
        // suppose i am at index 325 i can easily bring it t index 1 at cost =1;

        // So now we comes to the conclusion that each and every chips at odd position
        // can be taken to position 1 at 0 cost and each and every chips at even
        // position can be taken to position 2 at 0 cost.
        // So now we have all the chips at position 1 and 2 only. And now we have to
        // decide whether to take all the chips from position 2 to 1 or position 1 to 2,
        // and in both the cases cost will be 1 per chips. so better will be to pick
        // minimum of the two and put it to the other index to have minimum cost
        int even = 0;
        int odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}
