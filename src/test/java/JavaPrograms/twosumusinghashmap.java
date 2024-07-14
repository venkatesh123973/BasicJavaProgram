package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosumusinghashmap {

    public static int[] twosumusinghashmap(int[] nums,int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 2, 7};
        int target = 9;
        int[] result = twosumusinghashmap(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    }

