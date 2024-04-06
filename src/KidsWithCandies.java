import java.util.LinkedList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        System.out.println((kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1)));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        for (int i = 0; i < candies.length; i++) {
            int tempInt = candies[i] + extraCandies;
            int max = 0;
            for (int j = 0; j < candies.length; j++) {
                if(tempInt < candies[j]) max++;
            }
            if(max > 0) { result.add(false); }
            else result.add(true);
        }
        return result;
    }
}