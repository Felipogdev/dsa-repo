package neetcode.arrayandhashing.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] res = {i,j};
                    return res;
                }
            }
        }
        return null;
    }


        public int[] twoSumBruteForce(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }


        public int[] twoSumHAsh(int[] nums, int target) {
            Map<Integer, Integer> indices = new HashMap<>();  // val -> index

            for (int i = 0; i < nums.length; i++) {
                indices.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (indices.containsKey(diff) && indices.get(diff) != i) {
                    return new int[]{i, indices.get(diff)};
                }
            }

            return new int[0];
        }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
