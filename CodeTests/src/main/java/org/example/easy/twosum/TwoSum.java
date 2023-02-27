package org.example.easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static String execute(int[] nums, int target) {
        //[2,7,11,15] 9
        //0,1
        //[3,2,4] 6
        //1,2
        //[3,3] 6
        //0,1

        Map<Integer, Integer> complimentMap = new HashMap<>();

        for(int x = 0; x < nums.length; x++) {
            int compliment = target - nums[x];
            if(complimentMap.containsKey(compliment)) {
                return complimentMap.get(compliment) + "," + x;
            }

            complimentMap.put(nums[x], x);
        }
        throw new IllegalArgumentException("No two numbers sum up to target");
    }

}
