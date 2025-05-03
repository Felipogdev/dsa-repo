package neetcode.arrayandhashing.containsduplicate;

import java.util.HashSet;

public class ContainsDuplicate {

    // O(n^2) time complexity
    // O(1) space complexity
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean constainsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;

    }


    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        int[] numsDup = {1, 2, 3, 3, 4};

        int[] numsNoDup = {1, 2, 3, 4, 5};

        boolean result = cd.containsDuplicate(numsDup);
        System.out.println("Contains duplicate: " + result);

        result = cd.containsDuplicate(numsNoDup);
        System.out.println("Contains duplicate: " + result);

        boolean result2 = cd.constainsDuplicateHashSet(numsDup);
        System.out.println("Contains duplicate: " + result2);
        result2 = cd.constainsDuplicateHashSet(numsNoDup);
        System.out.println("Contains duplicate: " + result2);

    }
}
