package day3;

import java.util.ArrayList;
import java.util.List;

import utils.Max;

public class Day3 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
        
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max_el = Max.max_el_arr(candies);

        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max_el) result.add(true);
            else result.add(false);
        }

        return result;
    }


}
