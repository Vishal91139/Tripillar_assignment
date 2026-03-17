// LeetCode 46 – Permutations (Medium)

package MODULE_9;

import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    public static void backtrack(List<List<Integer>> result,
                                 List<Integer> current,
                                 int[] nums) {
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backtrack(result, current, nums);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
